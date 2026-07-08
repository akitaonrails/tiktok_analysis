package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.multi.ui.AnchorPanelExtraInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067000dsA extends LinearLayout {
    public View LL;

    public C1067000dsA(Context context) {
        super(context, null, 0);
    }

    public final void LIZ(AnchorCommonStruct anchorCommonStruct, AnchorPanelExtraInfo anchorPanelExtraInfo, Function0<Unit> function0, Function0<Unit> function02) {
        ViewGroup viewGroup;
        String description;
        String keyword;
        boolean z;
        String str;
        if (this.LL == null) {
            this.LL = C786410Ut5.Sd(R.layout.f861p2, C786410Ut5.ne(getContext()), this);
        }
        View view = this.LL;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.azn)) != null) {
            C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(getContext());
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail == null) {
                if (anchorPanelExtraInfo != null) {
                    str = anchorPanelExtraInfo.downgradeIcon;
                } else {
                    str = null;
                }
                thumbnail = C0OD6.LIZLLL(str);
            }
            c1394730mOlLIZ.setIcon(thumbnail);
            if (anchorPanelExtraInfo == null || (description = anchorPanelExtraInfo.subTitle) == null) {
                description = anchorCommonStruct.getDescription();
            }
            c1394730mOlLIZ.setSubTitle(description);
            if ((anchorPanelExtraInfo == null || (keyword = anchorPanelExtraInfo.title) == null) && (keyword = anchorCommonStruct.getKeyword()) == null) {
                keyword = "";
            }
            c1394730mOlLIZ.setTitle(keyword);
            if (anchorPanelExtraInfo != null) {
                z = anchorPanelExtraInfo.useTextStyleButton;
            } else {
                z = false;
            }
            c1394730mOlLIZ.LIZIZ(z);
            C786410Ut5.I7(new C1077240e8g(function0, 0), c1394730mOlLIZ);
            c1394730mOlLIZ.setButtonIcon(C1392810mLf.LIZIZ(anchorCommonStruct));
            c1394730mOlLIZ.setButtonOnClickListener(new AwS595S0100000_16((Function0) function02, (Function0<Unit>) 266));
            viewGroup.addView(c1394730mOlLIZ);
        }
    }
}
