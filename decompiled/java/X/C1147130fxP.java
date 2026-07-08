package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService;

/* JADX INFO: renamed from: X.0fxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService", f = "MusicGiftService.kt", l = {227}, m = "fetchLyrics$suspendImpl")
public final class C1147130fxP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MusicGiftService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147130fxP(MusicGiftService musicGiftService, InterfaceC1364105Vn<? super C1147130fxP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MusicGiftService@89.fetchLyrics$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = MusicGiftService.LIZ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("MusicGiftService@89.fetchLyrics$1");
        return objLIZ;
    }
}
