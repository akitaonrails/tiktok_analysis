package Y;

import X.AbstractC19531111bB;
import X.C05YF;
import X.C0E48;
import X.C0E5S;
import X.C0EIZ;
import X.C0EOX;
import X.C0EY2;
import X.C0F8Y;
import X.C0FVG;
import X.C0FVT;
import X.C0FWO;
import X.C0FWT;
import X.C0LAB;
import X.C0P0T;
import X.C1167170gTj;
import X.C1462920oAk;
import X.C1664680tQA;
import X.C1919207fS;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C350870DpF;
import X.C361680EFy;
import X.C362270EIf;
import X.C362280EIg;
import X.C363500EMy;
import X.C363750ENx;
import X.C377730ErT;
import X.C385670FAf;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1466150oFx;
import X.InterfaceC1441305kZ;
import X.InterfaceC391240FVq;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class AObjectS302S0200000_5 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        C1664680tQA<TextStickerModel> c1664680tQAZ;
        Boolean bool = (Boolean) obj;
        InterfaceC391240FVq interfaceC391240FVqQj = ((AbstractC19531111bB) aObjectS302S0200000_5.l0).qj();
        if (interfaceC391240FVqQj != null) {
            AbstractC19531111bB abstractC19531111bB = (AbstractC19531111bB) aObjectS302S0200000_5.l0;
            C0FVT c0fvt = (C0FVT) aObjectS302S0200000_5.l1;
            C0FWO c0fwo = (C0FWO) interfaceC391240FVqQj.LLIIIZ(EnumC1466150oFx.TEXT);
            if (c0fwo != null && (c1664680tQAZ = c0fwo.Z()) != null && C0F8Y.LJII(c1664680tQAZ.LIZ)) {
                if (!bool.booleanValue()) {
                    c1664680tQAZ.LIZ(new C2217371BqR() { // from class: X.0FIf
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((TextStickerModel) obj2).getFontModel();
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj2, Object obj3) {
                            ((TextStickerModel) obj2).setFontModel((TextFontModel) obj3);
                        }
                    }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FQW
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((TextFontModel) obj2).fontId;
                        }
                    }).LIZIZ(abstractC19531111bB.LLJLILLLLZIIL);
                } else {
                    abstractC19531111bB.LLJLILLLLZIIL = new AObjectS302S0200000_5(abstractC19531111bB, c1664680tQAZ, 1);
                    c1664680tQAZ.LIZ(new C2217371BqR() { // from class: X.0FIg
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((TextStickerModel) obj2).getFontModel();
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj2, Object obj3) {
                            ((TextStickerModel) obj2).setFontModel((TextFontModel) obj3);
                        }
                    }).LJIIIIZZ(new C2217381BqS() { // from class: X.0FVZ
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((TextFontModel) obj2).fontResId;
                        }
                    }).LIZ((LifecycleOwner) c0fvt, abstractC19531111bB.LLJLILLLLZIIL);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        if (((AbstractC19531111bB) aObjectS302S0200000_5.l0).LLJLL.contains(obj)) {
            ((AbstractC19531111bB) aObjectS302S0200000_5.l0).LLJLLIL = C1919207fS.LJIIIZ();
            ((C1664680tQA) aObjectS302S0200000_5.l1).LIZLLL(new AwS584S0100000_5((AbstractC19531111bB) aObjectS302S0200000_5.l0, (AbstractC19531111bB<C05YF>) 27), true);
        } else {
            if (((TextStickerModel) ((C1664680tQA) aObjectS302S0200000_5.l1).LIZ).getLineSpacingExtra() <= 0.0f) {
                return;
            }
            ((AbstractC19531111bB) aObjectS302S0200000_5.l0).LLJLLIL = -C1919207fS.LJIIJJI();
            ((C1664680tQA) aObjectS302S0200000_5.l1).LIZLLL(new AwS584S0100000_5((AbstractC19531111bB) aObjectS302S0200000_5.l0, (AbstractC19531111bB<C05YF>) 28), true);
        }
    }

    public static final void onChanged$10(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        if (!C363750ENx.LIZIZ("multi_music_guide_has_shown_in_root") && C362270EIf.LIZ(((C362280EIg) aObjectS302S0200000_5.l0).LIZ)) {
            ((Function0) aObjectS302S0200000_5.l1).invoke();
        }
    }

    public static final void onChanged$2(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        if (!C1462920oAk.LIZJ((View) aObjectS302S0200000_5.l0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aObjectS302S0200000_5.l0).getLayoutParams();
            Activity activity = ((C1167170gTj) aObjectS302S0200000_5.l1).mActivity;
            if (activity != null) {
                marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(activity) + ((C1167170gTj) aObjectS302S0200000_5.l1).getResources().getDimensionPixelSize(R.dimen.adk);
                C786410Ut5.W5((View) aObjectS302S0200000_5.l0, marginLayoutParams);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void onChanged$3(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        LiveEvent<Unit> liveEventIv1;
        ((Function0) aObjectS302S0200000_5.l0).invoke();
        C0FWT c0fwtO3 = ((C0FVG) aObjectS302S0200000_5.l1).O3();
        if (c0fwtO3 != null && (liveEventIv1 = c0fwtO3.Iv1()) != null) {
            liveEventIv1.LIZIZ(aObjectS302S0200000_5);
        }
    }

    public static final void onChanged$4(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C363500EMy c363500EMy = C363500EMy.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS302S0200000_5.l0;
            c363500EMy.getClass();
            if ((videoPublishEditModel.mIsFromDraft || videoPublishEditModel.isFromCrash()) && !((C377730ErT) aObjectS302S0200000_5.l1).P6()) {
                ((C377730ErT) aObjectS302S0200000_5.l1).u8();
            }
        }
    }

    public static final void onChanged$5(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        String uuid;
        NLECommit head;
        NLEEditor nLEEditorLJFF = C350870DpF.LJFF((C0E48) aObjectS302S0200000_5.l0);
        String str = ((C0EOX) aObjectS302S0200000_5.l1).m6().LLJIJIL;
        NLEBranch branch = nLEEditorLJFF.getBranch();
        VideoPublishEditModel editModel = null;
        if (branch != null && (head = branch.getHead()) != null) {
            uuid = head.getUUID();
        } else {
            uuid = null;
        }
        nLEEditorLJFF.trimRange(str, uuid);
        C0E5S c0e5sP6 = ((C0EOX) aObjectS302S0200000_5.l1).P6();
        if (c0e5sP6 != null) {
            c0e5sP6.yV(AFwS234S0000000_5.get$arr$(324));
        }
        int i = (int) (((C0EOX) aObjectS302S0200000_5.l1).T2().LIZIZ * 100);
        C0EY2 c0ey2S5 = ((C0EOX) aObjectS302S0200000_5.l1).S5();
        if (c0ey2S5 != null) {
            editModel = c0ey2S5.getEditModel();
        }
        C0E48 c0e48 = (C0E48) aObjectS302S0200000_5.l0;
        if (editModel != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel, c0e48, new Pair(-1, -1));
            c0labLJFF.LIZ(i, "opacity_parameter");
            C20684815ws.LJIILLIIL("adjust_opacity", c0labLJFF.LIZ);
        }
    }

    public static final void onChanged$6(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        ((h0) aObjectS302S0200000_5.l0).LJFF(new Pair(obj, ((C385670FAf) aObjectS302S0200000_5.l1).LIZJ()));
    }

    public static final void onChanged$7(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        ((h0) aObjectS302S0200000_5.l0).LJFF(new Pair(((C385670FAf) aObjectS302S0200000_5.l1).LIZJ(), obj));
    }

    public static final void onChanged$8(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        ((InterfaceC1441305kZ) aObjectS302S0200000_5.l0).onChanged(obj);
        ((LiveEvent) aObjectS302S0200000_5.l1).LIZIZ(aObjectS302S0200000_5);
    }

    public static final void onChanged$9(AObjectS302S0200000_5 aObjectS302S0200000_5, Object obj) {
        ((C0EIZ) aObjectS302S0200000_5.l0).LLJ.removeCallbacksAndMessages(null);
        ((C0P0T) aObjectS302S0200000_5.l1).dismiss();
    }

    public AObjectS302S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
