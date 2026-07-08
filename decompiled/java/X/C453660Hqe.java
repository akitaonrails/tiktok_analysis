package X;

import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453660Hqe {
    public final List<ImageView> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C453660Hqe(View view) {
        this.LIZ = C1697810uHb.LJIIJJI(view.findViewById(R.id.kfb), view.findViewById(R.id.kfc), view.findViewById(R.id.kfd), view.findViewById(R.id.kfe), view.findViewById(R.id.kff));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<SocialEmoji> list, Function1<? super SocialEmoji, Unit> function1) {
        Iterator it2 = C13LP.LLIIL(this.LIZ).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (c717610SCx.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                int i = indexedValue.LIZ;
                ImageView imageView = (ImageView) indexedValue.LIZIZ;
                SocialEmoji socialEmoji = (SocialEmoji) C13LP.LJJJLZIJ(i, list);
                if (socialEmoji != null) {
                    imageView.setImageBitmap(C0GZ1.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), socialEmoji.emoji));
                    C786410Ut5.Q7(imageView, new ACListenerS110S0200000_6(function1, socialEmoji, 30));
                }
            } else {
                return;
            }
        }
    }
}
