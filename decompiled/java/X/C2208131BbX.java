package X;

import com.ss.bduploader.BDVideoUploader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208131BbX extends C09AY implements Function1<BDVideoUploader, Unit> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208131BbX(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BDVideoUploader bDVideoUploader) {
        bDVideoUploader.setPoster(this.LL);
        return Unit.LIZ;
    }
}
