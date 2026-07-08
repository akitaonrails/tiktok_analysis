package X;

import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816860xNc extends C09AY implements Function0<CardView> {
    public final /* synthetic */ RichTextPreviewView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816860xNc(RichTextPreviewView richTextPreviewView) {
        super(0);
        this.LL = richTextPreviewView;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, androidx.cardview.widget.CardView] */
    @Override // kotlin.jvm.functions.Function0
    public final CardView invoke() {
        return this.LL.LLILLJJLI.findViewById(R.id.for_res_0x7f0a1f17);
    }
}
