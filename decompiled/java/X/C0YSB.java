package X;

import com.bytedance.im.core.proto.InputStatusNotify;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YSB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSB extends Message.Builder<InputStatusNotify, C0YSB> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public EnumC869400Y8s LJI;
    public EnumC872840YLy LJII;
    public C0YM0 LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InputStatusNotify build() {
        EnumC872840YLy enumC872840YLy = this.LJII;
        if (enumC872840YLy != null && this.LJIIJ != null) {
            return new InputStatusNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC872840YLy, "input_status", this.LJIIJ, "create_time");
        throw null;
    }
}
