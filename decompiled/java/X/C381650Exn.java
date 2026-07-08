package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Exn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381650Exn extends AbstractC381690Exr {
    public C381650Exn(InterfaceC497601wk interfaceC497601wk, VideoPublishEditModel videoPublishEditModel, InterfaceC381790Ey1 interfaceC381790Ey1) {
        super(interfaceC497601wk, videoPublishEditModel, interfaceC381790Ey1);
    }

    public final void LJIIIZ(C381600Exi c381600Exi, float f, float f2, InterfaceC382380Eyy interfaceC382380Eyy, boolean z) {
        List listSingletonList;
        String string;
        String strLIZ = c381600Exi.LIZ;
        if (a0.LJJJIL(strLIZ)) {
            strLIZ = C2537009wu.LIZ();
        }
        if (!c381600Exi.LJIIL.isEmpty()) {
            listSingletonList = c381600Exi.LJIIL;
        } else if (!a0.LJJJIL(c381600Exi.LJI)) {
            listSingletonList = Collections.singletonList(c381600Exi.LJI);
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        if (c381600Exi.LJI.length() > 0) {
            C2225908np c2225908np = C2225908np.LIZ;
            String str = c381600Exi.LJI;
            c2225908np.getClass();
            string = Uri.fromFile(new C0VSJ(str)).toString();
        } else {
            string = "";
        }
        CreativeInfo creativeInfo = this.LIZIZ.creativeModel.creativeInfo;
        String str2 = c381600Exi.LJIIJJI;
        String str3 = c381600Exi.LJII;
        int i = c381600Exi.LJIIJ;
        String str4 = c381600Exi.LJIIIIZZ.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
        Iterator it2 = listSingletonList.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C382120EyY((String) it2.next(), null, 6));
        }
        EnumC377820Erc enumC377820Erc = c381600Exi.LJ;
        if (enumC377820Erc == null) {
            enumC377820Erc = EnumC377820Erc.EP_AIGC_T2I;
        }
        EnumC377680ErO enumC377680ErO = c381600Exi.LIZLLL;
        if (enumC377680ErO == null) {
            enumC377680ErO = EnumC377680ErO.IMAGE_2_IMAGE;
        }
        C382170Eyd c382170Eyd = new C382170Eyd(creativeInfo, strLIZ, arrayList, str3, i, str2, str4, enumC377820Erc, enumC377680ErO, c381600Exi.LIZ(), 0, null, 1072691240);
        EnumC381960EyI enumC381960EyI = c381600Exi.LIZJ;
        if (enumC381960EyI == null) {
            enumC381960EyI = EnumC381960EyI.EDITOR_PRO_AIGC_T2I;
        }
        EnumC381980EyK enumC381980EyK = c381600Exi.LJFF;
        if (enumC381980EyK == null) {
            enumC381980EyK = EnumC381980EyK.EDITOR_PRO_AIGC_T2I;
        }
        LJIIIIZZ(string, interfaceC382380Eyy, c382170Eyd, z, enumC381960EyI, enumC381980EyK);
    }
}
