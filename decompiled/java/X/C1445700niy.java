package X;

import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0niy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445700niy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1445690nix LLILLL;
    public final /* synthetic */ List<SrcImageInfo> LLILZ;
    public final /* synthetic */ AtomicInteger LLILZIL;
    public final /* synthetic */ AtomicReference<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445700niy(int i, int i2, InterfaceC1445690nix interfaceC1445690nix, List<SrcImageInfo> list, AtomicInteger atomicInteger, AtomicReference<String> atomicReference) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = interfaceC1445690nix;
        this.LLILZ = list;
        this.LLILZIL = atomicInteger;
        this.LLILZLL = atomicReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        if (i == this.LLILLJJLI) {
            this.LLILLL.onSuccess(this.LLILZ);
        } else if (i > 0) {
            InterfaceC1445690nix interfaceC1445690nix = this.LLILLL;
            int i2 = this.LLILZIL.get();
            String str = this.LLILZLL.get();
            if (str == null) {
                str = "partial download error";
            }
            interfaceC1445690nix.LIZ(i2, str);
        } else {
            InterfaceC1445690nix interfaceC1445690nix2 = this.LLILLL;
            this.LLILZIL.get();
            this.LLILZLL.get();
            interfaceC1445690nix2.onFailed();
        }
        return Unit.LIZ;
    }
}
