package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1111640f2A extends AbstractC1111810f2R<InterfaceC1113740f5Y, C1113730f5X> {
    @Override // X.AbstractC1111810f2R
    public final String LJIIJ() {
        return "capsule";
    }

    @Override // X.AbstractC1111810f2R
    public int LJIIIIZZ() {
        Boolean bool;
        DataChannel dataChannel = LJIIJJI().LJIIIZ;
        return (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.layout.gps : R.layout.gq5;
    }

    @Override // X.AbstractC1111810f2R
    /* JADX INFO: renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public C1113730f5X LJIILJJIL(View view) {
        return new C1113730f5X(view);
    }
}
