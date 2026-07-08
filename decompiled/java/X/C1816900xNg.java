package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.BoardItemTransform;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816900xNg extends AbstractC1817020xNs {
    public C11JF LLJJIJIIJIL;
    public ImageContent LLJJIJIL;
    public final C394501g7 LLJJJ;
    public ImageView LLJJJIL;

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public int getLayoutId() {
        return R.layout.g24;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIILJJIL() {
        ImageView imageView;
        ImageContent imageContent = this.LLJJIJIL;
        if (imageContent == null || (imageView = this.LLJJJIL) == null) {
            return;
        }
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        this.LLJJIJIIJIL = C408001iI.LIZ(imageView, imageContent, new C1816920xNi(this), new C1816820xNY(this));
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIIZ() {
        View contentView = getContentView();
        ImageView imageView = contentView != null ? (ImageView) contentView.findViewById(R.id.pwp) : null;
        this.LLJJJIL = imageView;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new View.OnClickListener() { // from class: X.0xNh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.getOnClick().invoke();
                }
            });
        }
    }

    @Override // X.AbstractC1817020xNs
    public long getCurrentBoardIdentifier() {
        return getBoardId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf == null || !(!c11jf.isDisposed())) {
            return;
        }
        c11jf.dispose();
    }

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public C394501g7 getConfig() {
        return this.LLJJJ;
    }

    public C1816900xNg(Context context) {
        super(context, null);
        EnumC389301fH enumC389301fH = EnumC389301fH.WIDGET;
        C1546210qL5.LIZ.getClass();
        this.LLJJJ = new C394501g7(enumC389301fH, true, true, false, C1546210qL5.LIZ(285), 1073708954);
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIJ(C1816930xNj c1816930xNj, DataChannel dataChannel) {
        float fFloatValue;
        this.LLJJIJIL = c1816930xNj.LIZ.overlayImage;
        C394501g7 config = getConfig();
        BoardItemTransform boardItemTransform = c1816930xNj.LIZ.transform;
        Float fValueOf = null;
        if (boardItemTransform != null) {
            fValueOf = Float.valueOf(boardItemTransform.scale);
        }
        if (Boolean.valueOf(!Intrinsics.LIZLLL(fValueOf, 0.0f)).booleanValue() && fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        config.LJJ = C13LZ.LIZLLL(fFloatValue, 0.66f, 1.5f);
        config.LJJI = c1816930xNj.LIZIZ;
        config.LJFF = c1816930xNj.LIZJ;
        config.LJJII = C488201vE.LIZ(c1816930xNj.LIZ, C488601vI.LIZ());
        config.LJJIII = c1816930xNj.LIZLLL;
        super.LJIIJ(c1816930xNj, dataChannel);
    }
}
