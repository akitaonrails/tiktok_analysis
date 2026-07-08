package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813870xIn extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ViewOnLayoutChangeListenerC1813860xIm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813870xIn(RichTextPreviewView richTextPreviewView, ViewOnLayoutChangeListenerC1813860xIm viewOnLayoutChangeListenerC1813860xIm) {
        super(1);
        this.LL = richTextPreviewView;
        this.LLILLJJLI = viewOnLayoutChangeListenerC1813860xIm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.removeOnLayoutChangeListener(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
