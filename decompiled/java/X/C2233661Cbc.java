package X;

import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233661Cbc extends Message.Builder<C2233641Cba, C2233661Cbc> {
    public EnumC2183371Ach LIZLLL;
    public ByteString LJ;
    public List<Long> LJFF = C1516540pZE.LJIIIIZZ();
    public C2233611CbX LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233641Cba build() {
        EnumC2183371Ach enumC2183371Ach = this.LIZLLL;
        if (enumC2183371Ach != null && this.LJ != null && this.LJI != null) {
            return new C2233641Cba(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2183371Ach, "arch_type", this.LJ, "layout_data_bytes", this.LJI, "biz_source");
        throw null;
    }
}
