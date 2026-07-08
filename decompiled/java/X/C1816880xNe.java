package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816880xNe extends C09AY implements Function0<C1836370xt5> {
    public final /* synthetic */ RichTextPreviewView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816880xNe(RichTextPreviewView richTextPreviewView) {
        super(0);
        this.LL = richTextPreviewView;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xt5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1836370xt5 invoke() {
        return this.LL.LLILLJJLI.findViewById(R.id.foq);
    }
}
