package X;

import X.C05YF;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.10Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19223010Ii<API extends C05YF> extends C193N<API, C190Z, C19224710Iz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public int LLIZ;
    public PrivacySettingsRestrictionItem LLIZLLLIL;
    public C19222610Ie LLJ;
    public boolean LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final View LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC19223010Ii.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC19223010Ii.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIII = 8;
    }

    public final HashMap<String, String> K4() {
        HashMap<String, String> map = new HashMap<>();
        map.put("creation_id", T4().getCreationId());
        map.put("enter_from", "video_post_page");
        map.put("content_type", C1428470nHB.LJIILL(T4()));
        map.put("content_source", C1428470nHB.LJIILIIL(T4()));
        map.put("shoot_way", T4().mShootWay);
        return map;
    }

    public final C19EG P4() {
        return (C19EG) this.LLJIJIL.getValue(this, LLJJI[0]);
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJI[1]);
    }

    public void d5() {
        Integer numValueOf;
        C19EG c19egP4 = P4();
        C19222610Ie c19222610Ie = this.LLJ;
        if (c19222610Ie == null) {
            return;
        }
        if (this.LLIZ == 1) {
            if (ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
                PrivacySettingsRestrictionItem privacySettingsRestrictionItem = this.LLIZLLLIL;
                if (!TextUtils.isEmpty(privacySettingsRestrictionItem != null ? privacySettingsRestrictionItem.disabledToast : null)) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                    PrivacySettingsRestrictionItem privacySettingsRestrictionItem2 = this.LLIZLLLIL;
                    creativeToastBuilder.message(privacySettingsRestrictionItem2 != null ? privacySettingsRestrictionItem2.disabledToast : null);
                    C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder);
                    return;
                }
            }
            PrivacySettingsRestrictionItem privacySettingsRestrictionItem3 = this.LLIZLLLIL;
            if (privacySettingsRestrictionItem3 == null || (numValueOf = Integer.valueOf(privacySettingsRestrictionItem3.resType)) == null) {
                return;
            }
            if (numValueOf.intValue() == 1) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder2.messageRes(2131847649);
                C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder2);
                return;
            }
            if (numValueOf.intValue() == 2) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder3.messageRes(2131834393);
                C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder3);
                return;
            }
            if (numValueOf.intValue() != 3 || c19222610Ie.LJ == 0) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
            creativeToastBuilder4.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder4.messageRes(c19222610Ie.LJ);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder4);
            return;
        }
        if (c19222610Ie.LJIIIIZZ && c19222610Ie.LJIIIZ != 0) {
            CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
            creativeToastBuilder5.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder5.messageRes(c19222610Ie.LJIIIZ);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder5);
            return;
        }
        if (this.LLJI && c19222610Ie.LJ != 0) {
            CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
            creativeToastBuilder6.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder6.messageRes(c19222610Ie.LJ);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder6);
            return;
        }
        if (c19222610Ie.LJIIJJI && c19222610Ie.LJFF != 0) {
            CreativeToastBuilder creativeToastBuilder7 = new CreativeToastBuilder();
            creativeToastBuilder7.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder7.messageRes(c19222610Ie.LJFF);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder7);
            return;
        }
        if (c19222610Ie.LJII && c19222610Ie.LJI != 0) {
            CreativeToastBuilder creativeToastBuilder8 = new CreativeToastBuilder();
            creativeToastBuilder8.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder8.messageRes(c19222610Ie.LJI);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder8);
            return;
        }
        if (C1443970ngB.LIZJ(c19222610Ie.LIZLLL)) {
            String strLIZ = C1443970ngB.LIZ(C1443970ngB.LIZIZ(c19222610Ie.LIZ));
            CreativeToastBuilder creativeToastBuilder9 = new CreativeToastBuilder();
            creativeToastBuilder9.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder9.message(strLIZ);
            C1390380mHk.LIZ(c19egP4, 2036, creativeToastBuilder9);
        }
    }

    public final boolean O4() {
        return this.LLJILLL;
    }

    public final boolean Z4() {
        return this.LLJJ;
    }

    public AbstractC19223010Ii(C1DRG c1drg) {
        super(c1drg);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJILJIL = new View(P4());
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }

    public final void k5(boolean z) {
        this.LLJILLL = z;
    }

    public final void n5(boolean z) {
        this.LLJJ = z;
    }

    public final void t5(C19222610Ie c19222610Ie) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        this.LLJ = c19222610Ie;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, c19222610Ie.LIZ);
        this.LLIZLLLIL = privacySettingsRestrictionItemLJIIIZ;
        if (privacySettingsRestrictionItemLJIIIZ != null) {
            i = privacySettingsRestrictionItemLJIIIZ.showType;
        } else {
            i = 0;
        }
        this.LLIZ = i;
        boolean zLIZJ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ();
        this.LLJI = zLIZJ;
        if (c19222610Ie.LIZIZ && (i2 = this.LLIZ) != 2) {
            if ((!zLIZJ || c19222610Ie.LJ == 0) && i2 != 1 && ((!c19222610Ie.LJIIJJI || c19222610Ie.LJFF == 0) && !C1443970ngB.LIZJ(c19222610Ie.LIZLLL) && !c19222610Ie.LJIIIIZZ && !c19222610Ie.LJII)) {
                z = false;
            } else {
                z = true;
            }
            this.LLJILLL = z;
            C013C c013c = new C013C();
            c013c.element = !z;
            if (z) {
                this.LLJJ = true;
            }
            C013C c013c2 = new C013C();
            if (c19222610Ie.LIZJ && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            c013c2.element = z2;
            if (c19222610Ie.LJIIL) {
                c013c2.element = false;
                c013c.element = false;
                this.LLJJ = true;
            }
            i3(new AwS394S0200000_28(c013c, c013c2, 42));
            return;
        }
        i3(AFwS271S0000000_28.get$arr$(224));
    }
}
