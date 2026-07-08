package X;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19599711mF implements InterfaceC1884650z8x {
    public final C19EG LL;
    public final Aweme LLILLJJLI;
    public final C705930RmZ LLILLL;
    public final ViewGroup LLILZ;
    public final boolean LLILZIL;
    public final FragmentManager LLILZLL;
    public View LLIZ;
    public Animator LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1137));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(797));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(834));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1630));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(835));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1100));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1139));

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    public final boolean LIZ() {
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) this.LLJILLL.getValue();
        return ((iSocialAvatarCreationStatusService == null || (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(((User) this.LLJILJIL.getValue()).getUid())) == null || (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) == null) ? null : c437560HDu.LIZ) == EnumC437540HDs.SUCCESSFUL;
    }

    @Override // X.InterfaceC1884650z8x
    public final void Xm(FrameLayout frameLayout, InteractStickerStruct interactStickerStruct) {
        Integer numValueOf;
        ((C1910890zpH) this.LLJIJIL.getValue()).LIZ("SocialAvatarStickerClickListener", "initConsumption");
        if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            List<InteractStickerStruct> interactStickerStructs = this.LLILLJJLI.getInteractStickerStructs();
            C19600111mJ c19600111mJ = null;
            if (interactStickerStructs != null && (numValueOf = Integer.valueOf(interactStickerStructs.indexOf(interactStickerStruct))) != null && numValueOf.intValue() == 0) {
                C705930RmZ c705930RmZ = this.LLILLL;
                if (c705930RmZ != null) {
                    c19600111mJ = c705930RmZ.LJIJJ;
                }
                C1910890zpH c1910890zpH = (C1910890zpH) this.LLJIJIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("interactiveEmojiNoticeParams=");
                sbLIZ.append(c19600111mJ);
                c1910890zpH.LIZ("SocialAvatarStickerClickListener", C2188811AlT.LIZIZ(sbLIZ));
                if (c19600111mJ != null && c19600111mJ.LIZ == 5) {
                    C1910890zpH c1910890zpH2 = (C1910890zpH) this.LLJIJIL.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reactionListManager=");
                    sbLIZ2.append(this.LLJJI.getValue());
                    c1910890zpH2.LIZ("SocialAvatarStickerClickListener", C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC19599811mG interfaceC19599811mG = (InterfaceC19599811mG) this.LLJJI.getValue();
                    if (interfaceC19599811mG != null) {
                        interfaceC19599811mG.LJLJJL(C19600011mI.LIZ(c19600111mJ));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.LLIZ = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.11mK] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        String str;
        List<String> expression;
        boolean z = false;
        if (interactStickerStruct.getSocialAvatarStickerStruct() == null) {
            return false;
        }
        if (((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            LIZIZ(interactStickerStruct, pointF, 2131827011, new AwS573S0100000_29(this, 1138));
        } else {
            SocialAvatarAccess socialAvatarAccess = (SocialAvatarAccess) PluggableExtentionKt.pluggableSpi$default(SocialAvatarAccess.class, false, false, false, 14, null);
            if (socialAvatarAccess != null && socialAvatarAccess.LIZLLL()) {
                if (C729510SjV.LJJIJIL(this.LLILLJJLI)) {
                    String aid = this.LLILLJJLI.getAid();
                    String authorUid = AwemeExtKt.getAuthorUid(this.LLILLJJLI);
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    User author = this.LLILLJJLI.getAuthor();
                    c735840Sti.getClass();
                    String str2 = null;
                    QuickDMEventParam quickDMEventParam = new QuickDMEventParam("feed", "social_avatar_sticker", aid, authorUid, String.valueOf(C735840Sti.LJIIIIZZ(author)), C0S1J.CLICK, str2, str2, z, z, str2, z, 16288);
                    C0S1K c0s1k = C0S1K.LIZIZ;
                    C19EG c19eg = this.LL;
                    FragmentManager supportFragmentManager = this.LLILZLL;
                    if (supportFragmentManager == null) {
                        supportFragmentManager = c19eg.getSupportFragmentManager();
                    }
                    Aweme aweme = this.LLILLJJLI;
                    c0s1k.LIZLLL(c19eg, null, supportFragmentManager, quickDMEventParam, aweme, aweme.getAuthor(), "social_avatar_sticker", "feed", "", !this.LLILZIL, new C0I08() { // from class: X.0I0K
                        @Override // X.C0I08
                        public final void TG() {
                            this.LL.getClass();
                            C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
                        }

                        @Override // X.C0I08
                        public final void YO(C0I0E c0i0e, String str3) {
                            this.LL.getClass();
                            C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
                        }
                    }, AFwS218S0000000_29.get$arr$(473), new C0SZG(this) { // from class: X.11mK
                        @Override // X.C0SZG
                        public final void LIZ() {
                        }

                        @Override // X.C0SZG
                        public final void LIZIZ(View view, CharSequence charSequence) {
                        }
                    }, null, null, null, false, false, false, null, null);
                    C0HWW c0hww = C0HWW.LIZ;
                    boolean zLIZ = LIZ();
                    c0hww.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "click_social_avatar_sticker");
                    c2344009Gk.LIZJ(zLIZ ? 1 : 0, "has_social_avatar_sticker");
                    C20684815ws.LJIILLIIL("story_interaction_page", c2344009Gk.LIZ);
                    C0HYP.LIZ.getClass();
                    if (!C0HYP.LJ().getBoolean("has_consumed_sticker_tap_intro_text", false)) {
                        C861070XqD.LIZ.setValue(Boolean.TRUE);
                        C0HYP.LJ().storeBoolean("has_consumed_sticker_tap_intro_text", true);
                    }
                } else if (LIZ()) {
                    LIZIZ(interactStickerStruct, pointF, 2131827012, new AwS407S0200000_6(this, interactStickerStruct, 133));
                } else {
                    LIZIZ(interactStickerStruct, pointF, 2131827013, new AwS550S0100000_6(this, 1631));
                }
            }
        }
        C0HWW c0hww2 = C0HWW.LIZ;
        boolean zBooleanValue = ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
        SocialAvatarStickerStruct socialAvatarStickerStruct = interactStickerStruct.getSocialAvatarStickerStruct();
        if (socialAvatarStickerStruct == null || (expression = socialAvatarStickerStruct.getExpression()) == null || (str = (String) C13LP.LJJJLL(expression)) == null) {
            str = "";
        }
        boolean zLJJIJIL = C729510SjV.LJJIJIL(this.LLILLJJLI);
        c0hww2.getClass();
        C0HWW.LJIL("click", str, zBooleanValue, zLJJIJIL);
        return true;
    }

    public final void LIZIZ(InteractStickerStruct interactStickerStruct, PointF pointF, int i, Function0<Unit> function0) {
        InterfaceC19595111lV interfaceC19595111lV;
        C259800zU c259800zU = new C259800zU();
        IToolsBusinessService iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi$default(IToolsBusinessService.class, false, false, false, 14, null);
        if (iToolsBusinessService != null) {
            iToolsBusinessService.showTip(this.LL, interactStickerStruct, pointF, i, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 888), new AwS430S0200000_29(function0, c259800zU, 135));
        }
        C705930RmZ c705930RmZ = this.LLILLL;
        if (c705930RmZ != null && (interfaceC19595111lV = c705930RmZ.LJIILIIL) != null) {
            interactStickerStruct.getType();
            interfaceC19595111lV.LIZIZ(true);
        }
    }

    public C19599711mF(C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, ViewGroup viewGroup, boolean z, FragmentManager fragmentManager) {
        this.LL = c19eg;
        this.LLILLJJLI = aweme;
        this.LLILLL = c705930RmZ;
        this.LLILZ = viewGroup;
        this.LLILZIL = z;
        this.LLILZLL = fragmentManager;
    }
}
