package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0o34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458160o34 extends AbstractC2255721DQs<InterfaceC1465140oEK> implements InterfaceC1465140oEK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public volatile String LLIZLLLIL;
    public final C0N4S LLILLJJLI = new C0N4S(0);
    public final ConcurrentHashMap<String, C204607154j> LLILLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C09AE> LLILZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C05XL<C204607154j>> LLILZIL = new ConcurrentHashMap<>();
    public final Set<String> LLILZLL = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set<String> LLIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final InterfaceC497601wk LLJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1458170o35.class, null);
    public final C1458080o2w LLJIJIL = new C1458080o2w();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1458160o34.class, "syncComponent", "getSyncComponent()Lcom/ss/android/ugc/gamora/editorpro/sync/IEPMusicSyncApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC1465140oEK X1() {
        return this;
    }

    private final InterfaceC1458170o35 o2() {
        return (InterfaceC1458170o35) this.LLJI.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC1465140oEK
    public void clear() {
        Iterator<T> it2 = this.LLILZ.values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        this.LLILZ.clear();
        Iterator<T> it3 = this.LLILZIL.values().iterator();
        while (it3.hasNext()) {
            ((C09AE) it3.next()).LIZIZ(null);
        }
        this.LLILZIL.clear();
        this.LLILLL.clear();
        this.LLILZLL.clear();
        this.LLIZ.clear();
        this.LLIZLLLIL = null;
        C0N4S c0n4s = this.LLILLJJLI;
        c0n4s.LIZ.evictAll();
        c0n4s.LIZIZ.clear();
    }

    @Override // X.InterfaceC1465140oEK
    public void o92() {
        C204607154j c204607154j;
        String str = this.LLIZLLLIL;
        if (str == null || this.LLIZ.contains(str) || (c204607154j = this.LLILLL.get(str)) == null) {
            return;
        }
        InterfaceC1458170o35 interfaceC1458170o35O2 = o2();
        if (interfaceC1458170o35O2 != null) {
            interfaceC1458170o35O2.BC(c204607154j);
        }
        this.LLIZ.add(str);
    }

    private final void W1() {
        NLEModel nleModel;
        NLEModel nleModel2;
        VideoPublishEditModel editModel = getEditModel();
        String strLIZ = C348160Dks.LIZ((editModel == null || (nleModel2 = editModel.getNleModel()) == null) ? null : nleModel2.getMainTrack());
        if (strLIZ.length() == 0) {
            C201955140j.LJIJI(C563650M8t.LIZIZ, "buildInitTask failed tag null or empty");
            return;
        }
        VideoPublishEditModel editModel2 = getEditModel();
        if (editModel2 == null || (nleModel = editModel2.getNleModel()) == null) {
            C201955140j.LJIJI(C563650M8t.LIZIZ, "buildInitTask failed nlemodel null");
        } else {
            CI2(strLIZ, nleModel);
        }
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) getDiContainer().LJIIL(null, VideoPublishEditModel.class);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1();
    }

    public final C0N4S Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1458160o34(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1465140oEK
    public C204607154j C42(String str) {
        return this.LLILLL.get(str);
    }

    @Override // X.InterfaceC1465140oEK
    public boolean Us1(String str) {
        if (!this.LLILZ.containsKey(str) && !this.LLILLL.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1465140oEK
    public void cG(String str) {
        this.LLILZLL.add(str);
    }

    @Override // X.InterfaceC1465140oEK
    public boolean eC0(String str) {
        return this.LLILLL.containsKey(str);
    }

    @Override // X.InterfaceC1465140oEK
    public boolean mw1(String str) {
        return this.LLILZLL.contains(str);
    }

    @Override // X.InterfaceC1465140oEK
    public void CI2(String str, NLEModel nLEModel) {
        this.LLIZLLLIL = str;
        if (this.LLILLL.containsKey(str)) {
            this.LLILZLL.remove(str);
            this.LLIZ.remove(str);
            o92();
            return;
        }
        C09AE c09ae = this.LLILZ.get(str);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLILZLL.remove(str);
        C099F c099fLIZIZ = C090F.LIZIZ();
        this.LLILZIL.put(str, c099fLIZIZ);
        this.LLILZ.put(str, C23250099c.LIZLLL(this.LLJ, null, null, new C1458150o33(this, c099fLIZIZ, nLEModel, str, null), 3));
    }

    @Override // X.InterfaceC1465140oEK
    public Object TC0(String str, InterfaceC1364105Vn<? super C204607154j> interfaceC1364105Vn) {
        C204607154j c204607154j = this.LLILLL.get(str);
        if (c204607154j != null) {
            return c204607154j;
        }
        C05XL<C204607154j> c05xl = this.LLILZIL.get(str);
        if (c05xl == null) {
            return null;
        }
        return c05xl.LJLIIIL(interfaceC1364105Vn);
    }
}
