package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142310fpd extends C09AY implements Function1<C1142290fpb, C1142290fpb> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Gift.ColorPickerInfo LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142310fpd(long j, long j2, Gift.ColorPickerInfo colorPickerInfo, List list) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = colorPickerInfo;
        this.LLILLL = j2;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1142290fpb invoke(C1142290fpb c1142290fpb) {
        return C1142290fpb.LIZ(c1142290fpb, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, 16);
    }
}
