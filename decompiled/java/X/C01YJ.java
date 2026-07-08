package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.model.PcsCalendlyMeetingRepository$fetchMeetingDataPollingAndCache$1", f = "PcsCalendlyMeetingRepository.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 49, 51, 59, 63, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C01YJ extends C09AX implements Function2<InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C013C LLILLJJLI;
    public C013C LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C01YH LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YJ(C01YH c01yh, String str, long j, String str2, long j2, InterfaceC1364105Vn<? super C01YJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c01yh;
        this.LLJI = str;
        this.LLJIJIL = j;
        this.LLJILJIL = str2;
        this.LLJILJILJ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01YJ c01yj = new C01YJ(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c01yj.LLIZLLLIL = obj;
        return c01yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[Catch: Exception -> 0x0203, TRY_ENTER, TryCatch #5 {Exception -> 0x0203, blocks: (B:82:0x01e7, B:37:0x00f6), top: B:118:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:48:0x0147, B:50:0x0151, B:52:0x0156, B:57:0x015f, B:59:0x0167, B:61:0x016c, B:68:0x017f, B:70:0x0188, B:69:0x0185, B:73:0x01b5, B:75:0x01bb, B:77:0x01bf, B:79:0x01c3), top: B:111:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:48:0x0147, B:50:0x0151, B:52:0x0156, B:57:0x015f, B:59:0x0167, B:61:0x016c, B:68:0x017f, B:70:0x0188, B:69:0x0185, B:73:0x01b5, B:75:0x01bb, B:77:0x01bf, B:79:0x01c3), top: B:111:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01b9 -> B:118:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01bd -> B:118:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01c1 -> B:118:0x01e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01e4 -> B:118:0x01e7). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01YJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
