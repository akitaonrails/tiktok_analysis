package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.ui.EPTemplateInfo;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580710Mq5 {
    public Aweme LIZ;
    public CreativeInfo LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJII;
    public TemplateSlot LJIIJ;
    public boolean LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public EPTemplateInfo LJI = new EPTemplateInfo(false, null, 3, null);
    public String LJIIIIZZ = "ugc_template";
    public final List<TemplateSlot> LJIIIZ = new ArrayList();
    public final List<List<TemplateSlot>> LJIIJJI = new ArrayList();
    public final Map<Class<? extends InterfaceC19711812Ai>, Object> LJIIL = new LinkedHashMap();
    public final MutableLiveData<Integer> LJIILIIL = new MutableLiveData<>();
    public List<TemplateSlot> LJIILJJIL = C13BV.INSTANCE;
    public List<String> LJIJI = new ArrayList();
    public double LJIJJ = -0.0d;

    public String LIZIZ() {
        return null;
    }

    public final Aweme LIZ() {
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            return aweme;
        }
        return null;
    }

    public String LIZJ() {
        return this.LJIIIIZZ;
    }

    public static AnchorCommonStruct LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        for (AnchorCommonStruct anchorCommonStruct2 : anchors) {
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
            if (anchorCommonStruct3.getType() == 65 || anchorCommonStruct3.getType() == 78 || Intrinsics.LJFF(anchorCommonStruct3.subType(), "pugc")) {
                anchorCommonStruct = anchorCommonStruct2;
                break;
            }
        }
        return anchorCommonStruct;
    }

    public final <T extends InterfaceC19711812Ai> T LJFF(Class<T> cls) {
        Object obj = ((LinkedHashMap) this.LJIIL).get(cls);
        if (obj instanceof InterfaceC19711812Ai) {
            return (T) obj;
        }
        return null;
    }

    public void LJI(String str) {
        this.LJIIIIZZ = str;
    }

    public final void LJII(int i) {
        List<TemplateSlot> next;
        List<TemplateSlot> listLIZ = C534180KxE.LIZ(this);
        if (i >= 0 && i < listLIZ.size()) {
            Integer value = this.LJIILIIL.getValue();
            if (value != null && i == value.intValue()) {
                return;
            }
            if (listLIZ.size() == ((ArrayList) this.LJIIIZ).size()) {
                this.LJIILIIL.setValue(Integer.valueOf(i));
                Object obj = ListProtector.get(this.LJIIIZ, i);
                Iterator<List<TemplateSlot>> it2 = this.LJIIJJI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.contains(obj)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                List<TemplateSlot> list = next;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                this.LJIILJJIL = list;
                return;
            }
            this.LJIILIIL.setValue(Integer.valueOf(i));
            this.LJIILJJIL = C13BV.INSTANCE;
        }
    }
}
