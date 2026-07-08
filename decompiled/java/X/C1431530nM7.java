package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431530nM7 extends C09AY implements Function2<Integer, AbstractImageUploader.ImageUploadInfo, Unit> {
    public final /* synthetic */ C1431480nM2 LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431530nM7(C1431480nM2 c1431480nM2, long j) {
        super(2);
        this.LL = c1431480nM2;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        int iIntValue = num.intValue();
        C1431480nM2 c1431480nM2 = this.LL;
        Map<String, Integer> map = c1431480nM2.LLJLILLLLZIIL;
        List<String> list = c1431480nM2.LLJILLL;
        if (list == null) {
            list = null;
        }
        map.put((String) ListProtector.get(list, iIntValue), Integer.valueOf((int) this.LLILLJJLI));
        C1431480nM2 c1431480nM22 = this.LL;
        C1431640nMI.LIZ(c1431480nM22.LLJLLIL, new C1431510nM5(c1431480nM22));
        return Unit.LIZ;
    }
}
