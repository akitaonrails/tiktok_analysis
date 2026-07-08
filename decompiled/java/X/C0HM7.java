package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAddFlashToCreationExperiment;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HM7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HM7 extends C09AY implements InterfaceC1631630sYr<C439660HLw, InterfaceC439650HLv, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialAvatarCameraSceneV2 LL;
    public final /* synthetic */ LiveData<C535700Kzg> LLILLJJLI;
    public final /* synthetic */ C05P1<C0HLC> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HM7(SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, MutableLiveData mutableLiveData, C05P0 c05p0) {
        super(4);
        this.LL = socialAvatarCameraSceneV2;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = c05p0;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(C439660HLw c439660HLw, InterfaceC439650HLv interfaceC439650HLv, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int i;
        boolean z;
        boolean zLJII;
        int i2;
        boolean zLJII2;
        int i3;
        C439660HLw c439660HLw2 = c439660HLw;
        InterfaceC439650HLv interfaceC439650HLv2 = interfaceC439650HLv;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            if ((iIntValue & 8) == 0) {
                zLJII2 = interfaceC1680500tpg2.LJJIIJ(c439660HLw2);
            } else {
                zLJII2 = interfaceC1680500tpg2.LJII(c439660HLw2);
            }
            if (zLJII2) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if ((iIntValue & 64) == 0) {
                zLJII = interfaceC1680500tpg2.LJJIIJ(interfaceC439650HLv2);
            } else {
                zLJII = interfaceC1680500tpg2.LJII(interfaceC439650HLv2);
            }
            if (zLJII) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) == 146 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            int i4 = 2131826307;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696870uG5.LIZ(2131826307);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ;
            interfaceC1680500tpg2.LJ();
            SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
            if (SocialAvatarAddFlashToCreationExperiment.LIZ() && this.LLILLL.getValue().LIZJ.LIZJ && interfaceC439650HLv2 == EnumC444760HcI.MUGSHOT_SUCCEED) {
                i4 = 2131824842;
            } else if (interfaceC439650HLv2 == EnumC444760HcI.MUGSHOT_SUCCEED) {
                i4 = 2131826292;
            } else if (interfaceC439650HLv2 == EnumC444760HcI.MUGSHOT_TAKEN) {
                i4 = 2131826291;
            } else if (interfaceC439650HLv2 != EnumC444760HcI.PHOTO_UPLOADING && interfaceC439650HLv2 != EnumC444760HcI.ALL_DONE) {
                C1684540twC c1684540twC = c439660HLw2.LIZ;
                if (!c1684540twC.LJ) {
                    i4 = 2131826306;
                } else if (c1684540twC.LIZJ.LIZIZ == 0 && !c1684540twC.LIZLLL) {
                    i4 = 2131826305;
                }
            } else {
                i4 = 2131857960;
            }
            interfaceC1676320tiw.LJIIJ(i4);
            Integer numValueOf = Integer.valueOf(interfaceC1676320tiw.LIZLLL());
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJII3 = interfaceC1680500tpg2.LJII(this.LL);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2 = this.LL;
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJII3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C0HL9(socialAvatarCameraSceneV2, interfaceC1676320tiw, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(numValueOf, (Function2) objLJJ2, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            if ((i & 112) == 32 || ((i & 64) != 0 && interfaceC1680500tpg2.LJII(interfaceC439650HLv2))) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII4 = z | interfaceC1680500tpg2.LJII(this.LL);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV22 = this.LL;
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (zLJII4 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C0HL7(interfaceC439650HLv2, socialAvatarCameraSceneV22, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(interfaceC439650HLv2, (Function2) objLJJ3, interfaceC1680500tpg2);
            boolean z2 = this.LLILLL.getValue().LIZ;
            LiveData<C535700Kzg> liveData = this.LLILLJJLI;
            SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = this.LL.LLLF;
            int iLIZLLL = interfaceC1676320tiw.LIZLLL();
            C0HM3 c0hm3 = this.LLILLL.getValue().LIZJ;
            View view = this.LL.mView;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII5 = interfaceC1680500tpg2.LJII(this.LL);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV23 = this.LL;
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            if (zLJII5 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS550S0100000_6(socialAvatarCameraSceneV23, 709);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            Function0 function0 = (Function0) objLJJ4;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII6 = interfaceC1680500tpg2.LJII(this.LL);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV24 = this.LL;
            Object objLJJ5 = interfaceC1680500tpg2.LJJ();
            if (zLJII6 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AwS550S0100000_6(socialAvatarCameraSceneV24, 710);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
            }
            Function0 function02 = (Function0) objLJJ5;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII7 = interfaceC1680500tpg2.LJII(this.LL);
            SocialAvatarCameraSceneV2 socialAvatarCameraSceneV25 = this.LL;
            Object objLJJ6 = interfaceC1680500tpg2.LJJ();
            if (zLJII7 || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS550S0100000_6(socialAvatarCameraSceneV25, 711);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
            }
            interfaceC1680500tpg2.LJ();
            C1666000tSI.LIZLLL(z2, liveData, socialAvatarCreationViewModelV2, interfaceC439650HLv2, iLIZLLL, c0hm3, view, function0, function02, (Function0) objLJJ6, interfaceC1680500tpg2, (i << 6) & 7168);
        }
        return Unit.LIZ;
    }
}
