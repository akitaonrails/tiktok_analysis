package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.MoltenFfiInstanceMsg;

/* JADX INFO: renamed from: X.1CIF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIF extends Message.Builder<MoltenFfiInstanceMsg, C1CIF> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MoltenFfiInstanceMsg build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new MoltenFfiInstanceMsg(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "type_id", this.LJ, "instance_id");
        throw null;
    }
}
