package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19635511s1 extends AbstractC19588311kP<LiveEventCountDownStickerModel> implements InterfaceC1141530foN {
    public C1664680tQA<LiveEventCountDownStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public C19635911s5 LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void destroy() {
        C1548820qPI.LJIIIIZZ("live_event_update_result", this);
        C1548820qPI.LJIIIIZZ("live_event_delete_result", this);
    }

    public final InterfaceC19625011qK getOnClickListener() {
        return (InterfaceC19625011qK) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19635511s1.LIZLLL(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        LiveEventModule liveEventModuleLIZ;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "live_event_update_result")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null || (liveEventModuleLIZ = C477390Inp.LIZ(interfaceC1107590evd)) == null) {
                return;
            }
            C19635911s5 c19635911s5 = this.LLIZ;
            TuxTextView tuxTextView = null;
            if (c19635911s5 == null) {
                c19635911s5 = null;
            }
            c19635911s5.getClass();
            c19635911s5.LIZIZ(liveEventModuleLIZ.subscribed);
            c19635911s5.LJFF = liveEventModuleLIZ.isDefaultTitle;
            c19635911s5.LIZ();
            String str2 = liveEventModuleLIZ.title;
            c19635911s5.LJIIIZ = str2;
            TuxTextView tuxTextView2 = c19635911s5.LJ;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(str2);
            c19635911s5.LIZ();
            c19635911s5.LIZJ(liveEventModuleLIZ.startTime);
            return;
        }
        if (Intrinsics.LJFF(str, "live_event_delete_result")) {
            C500260Jjc.LJJJLL(this);
            destroy();
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        Context context = getContext();
        getInteractStickerContainerCommonParam();
        this.LLIZ = new C19635911s5(context);
        LIZLLL(getStruct());
        C19635911s5 c19635911s5 = this.LLIZ;
        LifecycleOwner lifecycleOwner2 = null;
        if (c19635911s5 == null) {
            c19635911s5 = null;
        }
        C1664680tQA<LiveEventCountDownStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 != null) {
            lifecycleOwner2 = lifecycleOwner3;
        }
        c19635911s5.getClass();
        c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11ri
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LiveEventCountDownStickerModel) obj).getVisible());
            }
        }).LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS585S0100000_6((ViewGroup) this, 369));
        c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11s0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LiveEventCountDownStickerModel) obj).isDefaultTitle());
            }
        }).LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(c19635911s5, 776));
        c1664680tQA2.LIZ(new C2217371BqR() { // from class: X.11rj
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((LiveEventCountDownStickerModel) obj).getTitle();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LiveEventCountDownStickerModel) obj).setTitle((String) obj2);
            }
        }).LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(c19635911s5, 777));
        c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11sI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((LiveEventCountDownStickerModel) obj).getEndTime());
            }
        }).LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(c19635911s5, 779));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r8, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r9) {
        /*
            r7 = this;
            r7.LLILZ = r8
            X.11ks r0 = r7.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto L74
            boolean r0 = r0.LJIIJ
            r4 = 1
            if (r0 != r4) goto L74
        Ld:
            X.11s5 r1 = new X.11s5
            android.content.Context r0 = r7.getContext()
            r7.getInteractStickerContainerCommonParam()
            r1.<init>(r0)
            r7.LLIZ = r1
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel
            r6 = 0
            if (r0 == 0) goto L71
            if (r9 == 0) goto L71
            r7.LIZLLL(r8)
            r7.postInvalidate()
            X.11ks r0 = r7.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto L72
            X.11ka r1 = r0.LIZ
        L30:
            X.11ka r0 = X.EnumC19589411ka.INTERACT
            if (r1 != r0) goto L6a
            X.11s5 r5 = r7.LLIZ
            if (r5 != 0) goto L39
            r5 = r6
        L39:
            kotlin.jvm.internal.AwS395S0200000_29 r3 = new kotlin.jvm.internal.AwS395S0200000_29
            r0 = 106(0x6a, float:1.49E-43)
            r3.<init>(r7, r8, r0)
            r5.LJI = r3
            X.127h r2 = r5.LIZJ
            if (r2 == 0) goto L4f
            wh6.AbS514S0200000_29 r1 = new wh6.AbS514S0200000_29
            r0 = 1
            r1.<init>(r3, r5, r0)
            X.C786410Ut5.U8(r2, r1)
        L4f:
            X.11s5 r0 = r7.LLIZ
            if (r0 == 0) goto L54
            r6 = r0
        L54:
            kotlin.jvm.internal.AwS430S0200000_29 r3 = new kotlin.jvm.internal.AwS430S0200000_29
            r0 = 120(0x78, float:1.68E-43)
            r3.<init>(r7, r8, r0)
            r6.LJII = r3
            android.widget.LinearLayout r2 = r6.LIZIZ
            if (r2 == 0) goto L6a
            wh6.AbS708S0100000_29 r1 = new wh6.AbS708S0100000_29
            r0 = 7
            r1.<init>(r3, r0)
            X.C786410Ut5.R7(r2, r1)
        L6a:
            java.lang.String r0 = "live_event_update_result"
            if (r4 == 0) goto L76
            X.C1548820qPI.LIZLLL(r0, r7)
        L71:
            return
        L72:
            r1 = r6
            goto L30
        L74:
            r4 = 0
            goto Ld
        L76:
            X.C1548820qPI.LIZLLL(r0, r7)
            java.lang.String r0 = "live_event_delete_result"
            X.C1548820qPI.LIZLLL(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19635511s1.LIZJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19635511s1(int i, Context context, C19591211ks c19591211ks) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 918));
    }
}
