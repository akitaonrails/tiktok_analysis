package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1459660o5U implements InterfaceC1460110o6D, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final LifecycleOwner LL;
    public final C1DRG LLILLJJLI;
    public final Function0<Bundle> LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1110));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459660o5U.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459660o5U.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[0]);
    }

    public final C1459640o5S LIZLLL() {
        return (C1459640o5S) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1460110o6D
    public List<C1460620o72> LIZ() {
        List<C1460620o72> listLIZIZ = LIZIZ();
        if (LIZJ().isEnterFromLinkShare()) {
            ArrayList arrayList = new ArrayList();
            for (C1460620o72 c1460620o72 : listLIZIZ) {
                int i = c1460620o72.LIZ;
                if (i != 15 && i != 21 && i != 2 && i != 5 && i != 16) {
                    arrayList.add(c1460620o72);
                }
            }
            listLIZIZ = arrayList;
        }
        C1460620o72 c1460620o722 = null;
        if (C1459780o5g.LIZ(LIZJ())) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listLIZIZ);
            int i2 = 0;
            Integer numValueOf = null;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (((C1460620o72) obj).LIZ == 15) {
                    numValueOf = Integer.valueOf(i2);
                }
                i2 = i3;
            }
            if (numValueOf != null) {
                ListProtector.add(arrayList2, 0, ListProtector.remove(arrayList2, numValueOf.intValue()));
            }
            listLIZIZ = arrayList2;
        }
        List<C1460620o72> listLIZ = C1459700o5Y.LIZ(listLIZIZ);
        if (((Boolean) AFwS210S0000000_22.get$arr$(515).invoke()).booleanValue()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(listLIZ);
            Iterator it2 = arrayList3.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                }
                if (((C1460620o72) it2.next()).LIZ == 17) {
                    break;
                }
                i4++;
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            if (numValueOf2.intValue() >= 0) {
                ListProtector.add(arrayList3, 0, ListProtector.remove(arrayList3, numValueOf2.intValue()));
            }
            listLIZ = arrayList3;
        }
        C1428470nHB.LJJLIIIJLLLLLLLZ(LIZJ());
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1428690nHX interfaceC1428690nHXLIZ = C1599690rjL.LIZ().LIZ();
        if (interfaceC1428690nHXLIZ.isEnable()) {
            ArrayList arrayList4 = new ArrayList(listLIZ);
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((C1460620o72) next).LIZ == 1200) {
                    if (next != null) {
                        arrayList4.remove(next);
                        if (interfaceC1428690nHXLIZ.LIZJ()) {
                            ListProtector.add(arrayList4, 0, next);
                        } else {
                            arrayList4.add(next);
                        }
                        listLIZ = C13LP.LLIIII(arrayList4);
                    }
                }
            }
        }
        boolean z = LIZJ().creativeModel.initialModel.dmCameraModel.enterFromDM;
        if (LIZJ().creativeModel.stickerModel.captionItemBarVisible) {
            Iterator<C1460620o72> it4 = listLIZ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C1460620o72 next2 = it4.next();
                if (next2.LIZ == 11) {
                    c1460620o722 = next2;
                    break;
                }
            }
            C1460620o72 c1460620o723 = c1460620o722;
            if (c1460620o723 != null) {
                c1460620o723.LJIIJJI = true;
            }
        }
        if (!LIZJ().isEnterFromBulletin()) {
            return listLIZ;
        }
        ArrayList arrayList5 = new ArrayList();
        for (C1460620o72 c1460620o724 : listLIZ) {
            if (c1460620o724.LIZ != 15) {
                arrayList5.add(c1460620o724);
            }
        }
        return arrayList5;
    }

    public List<C1460620o72> LIZIZ() {
        MvCreateVideoData mvCreateVideoData;
        ArrayList<String> arrayList;
        if (C1428470nHB.LJJZZI(LIZJ())) {
            if (C1416310mxZ.LJJJJZ(LIZJ())) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            C1459640o5S c1459640o5SLIZLLL = LIZLLL();
            if (C573570MeZ.LJ(LIZJ())) {
                c1459640o5SLIZLLL.LJIIIZ(arrayList2);
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1459640o5S.LLIZ;
            c1459640o5SLIZLLL.LJIJ(arrayList2, false);
            c1459640o5SLIZLLL.LJIILL(arrayList2);
            if (C573570MeZ.LJ(LIZJ())) {
                c1459640o5SLIZLLL.LJJ(arrayList2);
            }
            if (C573570MeZ.LJ(LIZJ())) {
                c1459640o5SLIZLLL.LJIIJ(arrayList2);
            }
            C1459640o5S.LJIIJJI(arrayList2);
            c1459640o5SLIZLLL.LIZLLL(null, arrayList2);
            c1459640o5SLIZLLL.LIZJ(null, arrayList2, false);
            C1459640o5S.LJIIZILJ(c1459640o5SLIZLLL, arrayList2);
            if (C573570MeZ.LJ(LIZJ())) {
                c1459640o5SLIZLLL.LJJIIJ(arrayList2);
            }
            c1459640o5SLIZLLL.LJIILLIIL(arrayList2, new AwS566S0100000_22(this, 1109));
            c1459640o5SLIZLLL.LJJII(arrayList2);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        LIZLLL().LJIJI(arrayList3);
        if ("slideshow".equals(C1428470nHB.LJIILL(LIZJ())) && (mvCreateVideoData = LIZJ().getMvCreateVideoData()) != null && (arrayList = mvCreateVideoData.selectMediaList) != null && arrayList.size() > 1 && C1459840o5m.LIZ()) {
            C1459640o5S.LJIIJJI(arrayList3);
            return arrayList3;
        }
        if (!C1428720nHa.LIZ(LIZJ())) {
            if (C1416310mxZ.LJJJJZI(LIZJ())) {
                return arrayList3;
            }
            C1459640o5S c1459640o5SLIZLLL2 = LIZLLL();
            C1428640nHS c1428640nHS = C1428640nHS.LIZ;
            VideoPublishEditModel videoPublishEditModelLIZJ = LIZJ();
            c1428640nHS.getClass();
            if (!C1428640nHS.LIZJ(videoPublishEditModelLIZJ)) {
                c1459640o5SLIZLLL2.LJIJ(arrayList3, false);
                c1459640o5SLIZLLL2.LJII(arrayList3);
                c1459640o5SLIZLLL2.LJIJJ();
            }
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ() && (LIZJ().isLivePhotoEdit() || C565160MEo.LJII(LIZJ()))) {
                c1459640o5SLIZLLL2.LJIILJJIL(arrayList3);
                c1459640o5SLIZLLL2.LJIIL(null, arrayList3, false);
            }
            c1459640o5SLIZLLL2.LJIILL(arrayList3);
            C1459640o5S.LJIIJJI(arrayList3);
            c1459640o5SLIZLLL2.LJ(arrayList3);
            c1459640o5SLIZLLL2.LIZJ(null, arrayList3, false);
            C1459640o5S.LJIIZILJ(c1459640o5SLIZLLL2, arrayList3);
            c1459640o5SLIZLLL2.LJFF(arrayList3);
            c1459640o5SLIZLLL2.LIZ(arrayList3);
            c1459640o5SLIZLLL2.LJIIIIZZ(arrayList3);
            c1459640o5SLIZLLL2.LJJII(arrayList3);
            c1459640o5SLIZLLL2.LJI(arrayList3);
            return arrayList3;
        }
        if (C1416310mxZ.LJJJJZI(LIZJ())) {
            return arrayList3;
        }
        C1459640o5S c1459640o5SLIZLLL3 = LIZLLL();
        C1428640nHS c1428640nHS2 = C1428640nHS.LIZ;
        VideoPublishEditModel videoPublishEditModelLIZJ2 = LIZJ();
        c1428640nHS2.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModelLIZJ2)) {
            c1459640o5SLIZLLL3.LJIJ(arrayList3, false);
            c1459640o5SLIZLLL3.LJII(arrayList3);
            c1459640o5SLIZLLL3.LJIJJ();
        }
        C578570Mmd.LIZ.getClass();
        if (C578570Mmd.LIZ() && (LIZJ().isLivePhotoEdit() || C565160MEo.LJII(LIZJ()))) {
            c1459640o5SLIZLLL3.LJIILJJIL(arrayList3);
        } else if (C573570MeZ.LJ(LIZJ())) {
            c1459640o5SLIZLLL3.LJIIIZ(arrayList3);
        }
        c1459640o5SLIZLLL3.LJIILL(arrayList3);
        if (C573570MeZ.LJ(LIZJ())) {
            c1459640o5SLIZLLL3.LJJ(arrayList3);
        }
        if (C573570MeZ.LJ(LIZJ())) {
            c1459640o5SLIZLLL3.LJIIJ(arrayList3);
        }
        C1459640o5S.LJIIJJI(arrayList3);
        c1459640o5SLIZLLL3.LJIIL(null, arrayList3, false);
        c1459640o5SLIZLLL3.LJIILLIIL(arrayList3, new AwS566S0100000_22(this, 1111));
        c1459640o5SLIZLLL3.LJ(arrayList3);
        c1459640o5SLIZLLL3.LJIIIIZZ(arrayList3);
        if (C573570MeZ.LJ(LIZJ())) {
            c1459640o5SLIZLLL3.LJJIIJ(arrayList3);
        }
        c1459640o5SLIZLLL3.LJI(arrayList3);
        c1459640o5SLIZLLL3.LIZJ(null, arrayList3, false);
        C1459640o5S.LJIIZILJ(c1459640o5SLIZLLL3, arrayList3);
        c1459640o5SLIZLLL3.LJFF(arrayList3);
        c1459640o5SLIZLLL3.LIZ(arrayList3);
        c1459640o5SLIZLLL3.LJJII(arrayList3);
        c1459640o5SLIZLLL3.LJIILLIIL(arrayList3, new AwS566S0100000_22(this, 1112));
        return arrayList3;
    }

    public final boolean LJ() {
        VideoPublishEditModel videoPublishEditModelLIZJ = LIZJ();
        C1664750tQH c1664750tQH = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        c1664750tQH.getValue(this, interfaceC2217461BqaArr[1]);
        if (!C1439620nZA.LIZIZ(videoPublishEditModelLIZJ)) {
            VideoPublishEditModel videoPublishEditModelLIZJ2 = LIZJ();
            this.LLILZIL.getValue(this, interfaceC2217461BqaArr[1]);
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_lightning_editpage_popup_with_settings_up", true, false) || !C1439620nZA.LIZ(videoPublishEditModelLIZJ2)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1459660o5U(LifecycleOwner lifecycleOwner, C1DRG c1drg, Function0<Bundle> function0) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c1drg;
        this.LLILLL = function0;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, Activity.class, null);
    }
}
