package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$fetchFromDisk$1$1", f = "StreamFetchOrchestrator.kt", l = {74, 77, 83, 85}, m = "invokeSuspend")
public final class C1633340sbc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends HorizontalEffectsModel, ? extends PanelInfoModel>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1633470sbp LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1633390sbh LLILZLL;
    public final /* synthetic */ C1633200sbO LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633340sbc(C1633470sbp c1633470sbp, int i, InterfaceC1633390sbh interfaceC1633390sbh, C1633200sbO c1633200sbO, InterfaceC1364105Vn<? super C1633340sbc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1633470sbp;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1633390sbh;
        this.LLIZ = c1633200sbO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633340sbc c1633340sbc = new C1633340sbc(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1633340sbc.LLILLL = obj;
        return c1633340sbc;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1633340sbc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends HorizontalEffectsModel, ? extends PanelInfoModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
