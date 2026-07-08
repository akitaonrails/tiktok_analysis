package X;

import com.bytedance.im.core.proto.Participant;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8Z extends Message.Builder<Participant, C0Y8Z> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public EnumC868560Y5m LJIIIIZZ;
    public Long LJIIIZ;
    public Map<String, String> LJIIJ = new LinkedHashMap();
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Participant build() {
        return new Participant(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
