package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19617811pA extends AbstractC2255721DQs<InterfaceC19626511qZ> implements InterfaceC19626511qZ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public String LLILZLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 669));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 668));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 671));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19617811pA.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19617811pA.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC19626511qZ W1() {
        return this;
    }

    private final C19617911pB X1() {
        return (C19617911pB) this.LLILZIL.getValue();
    }

    public final C19518411Xy Z1() {
        return (C19518411Xy) this.LLILZ.getValue();
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    public final C19616511ox o2() {
        return (C19616511ox) this.LLIZ.getValue();
    }

    public final InterfaceC391240FVq qj() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC19626511qZ
    public InterfaceC19627911qn LJIIJ() {
        return X1();
    }

    @Override // X.InterfaceC19626511qZ
    public boolean Xy1() {
        return !bb2().creativeModel.stickerModel.liveEventCountDownStickerModel.isEmpty();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC391240FVq.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC391240FVq.class, new AwS608S0100000_29(this, 375));
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19617811pA(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC19626511qZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A7(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r8) {
        /*
            r7 = this;
            java.lang.Class<com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService> r0 = com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService r0 = (com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService) r0
            if (r0 == 0) goto L4b
            boolean r1 = r0.LIZ()
            if (r1 == 0) goto L4c
            X.0oFx r2 = X.EnumC1466150oFx.LIVE_EVENT_COUNTDOWN
        L18:
            r3 = 1
            if (r8 != 0) goto L7b
            X.0FVq r0 = r7.qj()
            if (r0 == 0) goto L4f
            java.util.List r0 = r0.LLLILZLLLI(r2)
            if (r0 == 0) goto L4f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4f
            if (r1 == 0) goto L47
            r0 = 2131851052(0x7f11772c, float:1.9335684E38)
        L32:
            android.content.Context r2 = X.C1664590tQ1.LJIIIZ(r7)
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            r1.messageRes(r0)
            r1.isTuxToastLegacy(r3)
            r0 = 6012(0x177c, float:8.425E-42)
            X.C1390380mHk.LIZJ(r2, r0, r1)
            return
        L47:
            r0 = 2131829569(0x7f112341, float:1.929211E38)
            goto L32
        L4b:
            r1 = 0
        L4c:
            X.0oFx r2 = X.EnumC1466150oFx.LIVE_COUNTDOWN
            goto L18
        L4f:
            X.0FVq r1 = r7.qj()
            if (r1 == 0) goto L7b
            X.0oFx r0 = X.EnumC1466150oFx.LIVE_EVENT_STORY
            java.util.List r0 = r1.LLLILZLLLI(r0)
            if (r0 == 0) goto L7b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7b
            android.content.Context r2 = X.C1664590tQ1.LJIIIZ(r7)
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            r0 = 2131852233(0x7f117bc9, float:1.9338079E38)
            r1.messageRes(r0)
            r1.isTuxToastLegacy(r3)
            r0 = 6017(0x1781, float:8.432E-42)
            X.C1390380mHk.LIZJ(r2, r0, r1)
            return
        L7b:
            X.0FVq r3 = r7.qj()
            if (r3 == 0) goto L8a
            X.0FVt r1 = X.InterfaceC391240FVq.LJJJJZ
            java.lang.String r4 = "sticker_panel"
            r6 = 8
            X.C391270FVt.LIZ(r1, r2, r3, r4, r5, r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19617811pA.A7(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):void");
    }

    @Override // X.InterfaceC19626511qZ
    public void HQ(StickerModel stickerModel) {
        A7(stickerModel);
    }

    @Override // X.InterfaceC19626511qZ
    public void hF(String str) {
        this.LLILZLL = str;
    }
}
