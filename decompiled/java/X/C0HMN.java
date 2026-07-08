package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HMN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMN extends LinearLayout {
    public Context LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        Map mapLJIIJ;
        ISocialAvatarCreationService iSocialAvatarCreationService = (ISocialAvatarCreationService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationService.class, false, false, false, 14, null);
        if (iSocialAvatarCreationService == null || !Intrinsics.LJFF(iSocialAvatarCreationService.LIZIZ(), Boolean.TRUE)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            int i = C2187451AjH.LIZ;
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            InterfaceC19330810jy interfaceC19330810jyLJIJ = c1908480zlO.LJIJ(1012);
            if (interfaceC19330810jyLJIJ != null) {
                c1908480zlO.LJI(interfaceC19330810jyLJIJ);
            }
            C0HMO c0hmo = new C0HMO();
            c1908480zlO.LJ(c0hmo);
            c1908480zlO.LJIILL(c0hmo, c0hmo.LL);
            c0hmo.LLILLL = this;
            C0HYP.LIZ.getClass();
            C439460HLc c439460HLc = C0HLR.Companion;
            int i2 = C0HYP.LJ().getInt("uploading_flow_status", 0);
            c439460HLc.getClass();
            C0HLR c0hlr = C0HLR.map.get(Integer.valueOf(i2));
            if (c0hlr == null) {
                c0hlr = C0HLR.NONE;
            }
            C0HLR c0hlr2 = C0HLR.NONE;
            boolean z = c0hlr != c0hlr2;
            if (z) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("push_label", "social_avatar_upload_error_popup");
                int i3 = C0HLQ.LIZ[c0hlr.ordinal()];
                pairArr[1] = new Pair("request_type", i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "sa_create_req" : "tns_check" : "imageX_upload" : "face_detection" : "crop");
                mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            } else {
                mapLJIIJ = null;
            }
            new C19323510in(1012, "social_avatar_generation_error_popup", new InnerPushConfig(0L, null, 0, C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6), 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, null, null, 2, null, 0, null, null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), mapLJIIJ, null, 396).LIZIZ();
            if (z) {
                C0HYP.LJ().storeBoolean("uploading_flow_started", false);
                C0HYP.LJI(c0hlr2);
            }
        }
    }

    public final TuxTextView getCenterAreaMsg() {
        return this.LLILZ;
    }

    public final TuxIconView getCloseIcon() {
        return this.LLILZIL;
    }

    public final Context getViewContext() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0HMN(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            r3 = 0
            r5.<init>(r6, r0, r3)
            int r1 = X.C2187451AjH.LIZ
            r5.LL = r6
            android.view.LayoutInflater r4 = X.C786410Ut5.ne(r6)
            r2 = 2131566349(0x7f0d1f0d, float:1.8758237E38)
            r1 = 1
            android.view.View r2 = X.C786410Ut5.Td(r4, r2, r5, r1)
            r5.LLILLJJLI = r2
            if (r2 == 0) goto L71
            X.C786410Ut5.LJLLLLLL(r3, r2)
            r1 = 2131379101(0x7f0a439d, float:1.8378453E38)
            android.view.View r1 = r2.findViewById(r1)
            com.bytedance.tux.icon.TuxIconView r1 = (com.bytedance.tux.icon.TuxIconView) r1
            if (r1 == 0) goto L2a
            X.C786410Ut5.LLLLLLZZ(r1, r3)
        L2a:
            if (r2 == 0) goto L71
            r1 = 2131366913(0x7f0a1401, float:1.8353733E38)
            android.view.View r1 = r2.findViewById(r1)
        L33:
            r5.LLILLL = r1
            if (r1 == 0) goto L3a
            X.C786410Ut5.LJLLLLLL(r3, r1)
        L3a:
            if (r2 == 0) goto L6f
            r1 = 2131366915(0x7f0a1403, float:1.8353737E38)
            android.view.View r1 = r2.findViewById(r1)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L4a
            X.C786410Ut5.LLLLZLL(r1, r3)
        L4a:
            if (r2 == 0) goto L6f
            r1 = 2131366914(0x7f0a1402, float:1.8353735E38)
            android.view.View r1 = r2.findViewById(r1)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
        L55:
            r5.LLILZ = r1
            if (r1 == 0) goto L5c
            X.C786410Ut5.LLLLZLL(r1, r3)
        L5c:
            if (r2 == 0) goto L67
            r0 = 2131367509(0x7f0a1655, float:1.8354942E38)
            android.view.View r0 = r2.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
        L67:
            r5.LLILZIL = r0
            if (r0 == 0) goto L6e
            X.C786410Ut5.LLLLLLZZ(r0, r3)
        L6e:
            return
        L6f:
            r1 = r0
            goto L55
        L71:
            r1 = r0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HMN.<init>(android.content.Context):void");
    }

    public final void setCenterAreaMsg(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setCloseIcon(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setViewContext(Context context) {
        this.LL = context;
    }
}
