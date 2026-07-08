package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425614wA extends C09AY implements Function1<SymphonyEngine, C20425214w6> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20425614wA(String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20425214w6 invoke(SymphonyEngine symphonyEngine) {
        return symphonyEngine.LJIJJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }
}
