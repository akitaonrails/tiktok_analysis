package X;

import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVZ extends Message.Builder<NewDirectPushNotify, C0YVZ> {
    public EnumC875200YVa LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public String LJIIJ;
    public Map<String, String> LJIIJJI = new LinkedHashMap();
    public Long LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final NewDirectPushNotify build() {
        return new NewDirectPushNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
