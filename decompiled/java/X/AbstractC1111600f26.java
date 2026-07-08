package X;

import android.view.View;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import mr0.x;

/* JADX INFO: renamed from: X.0f26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111600f26 extends C1117360fBO {
    public C1109770ez9 LLILLL;
    public final ArrayList<Class<? extends InterfaceC1112060f2q>> LLILZ = new ArrayList<>();

    public abstract void LLLIL();

    public final C1109770ez9 LLLIIIIL() {
        C1109770ez9 c1109770ez9 = this.LLILLL;
        if (c1109770ez9 != null) {
            return c1109770ez9;
        }
        return null;
    }

    public final void LLLIILIL() {
        this.LLILLJJLI.LIZJ(C176100lz.class);
        if (!this.LLILZ.contains(C176100lz.class)) {
            this.LLILZ.add(C176100lz.class);
        }
        AbstractC1111810f2R<C176100lz, C242700wj> abstractC1111810f2R = new AbstractC1111810f2R<C176100lz, C242700wj>() { // from class: X.0f2C
            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "gift_collection";
            }

            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                Boolean bool;
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                return (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.layout.gq4 : R.layout.gq5;
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C242700wj(view);
            }
        };
        abstractC1111810f2R.LIZIZ = LLLIIIIL();
        C1111560f22 c1111560f22 = new C1111560f22(false);
        c1111560f22.LIZIZ = LLLIIIIL();
        this.LLILLJJLI.LIZJ(C176100lz.class);
        C1117380fBQ c1117380fBQ = new C1117380fBQ(this, C176100lz.class);
        c1117380fBQ.LIZJ = new C0J8P[]{abstractC1111810f2R, c1111560f22};
        c1117380fBQ.LIZ(new InterfaceC1112620f3k() { // from class: X.00wp
            @Override // X.InterfaceC1112620f3k
            public final int LIZ(Object obj) {
                if (((GiftCollectionUpdateMessage) ((AbstractC1110800f0o) obj).LJIL).giftCollection.messageType == 2) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public final <MODEL extends x, VH extends AbstractC1111020f1A<MODEL>> void LLLILZ(Class<MODEL> cls, AbstractC1111810f2R<MODEL, VH> abstractC1111810f2R) {
        this.LLILLJJLI.LIZJ(cls);
        if (!this.LLILZ.contains(cls)) {
            this.LLILZ.add(cls);
        }
        abstractC1111810f2R.LIZIZ = LLLIIIIL();
        LLLI(cls, abstractC1111810f2R);
    }
}
