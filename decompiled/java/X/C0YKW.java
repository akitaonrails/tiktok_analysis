package X;

import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.scene.Scene;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YKW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKW extends Message.Builder<AckMessage, C0YKW> {
    public String LIZLLL;
    public Boolean LJ;
    public EnumC868450Y5b LJFF;
    public String LJI;
    public Integer LJII;
    public EnumC869400Y8s LJIIIIZZ;
    public EnumC872340YKa LJIIIZ;
    public Boolean LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessage build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new AckMessage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "server_msg_id", this.LJ, "is_ws", this.LJFF, "msg_type", this.LJI, Scene.SCENE_SERVICE);
        throw null;
    }
}
