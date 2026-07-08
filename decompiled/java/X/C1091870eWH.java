package X;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.BannerImageLoadDefaultTypeSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.ImagePadding;
import webcast.data.TopRightBannerContainerComponent;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0eWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091870eWH extends ConstraintLayout implements C0ULX {
    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
    }

    @Override // X.C0ULX
    public final void onDetach() {
    }

    @Override // X.C0ULX
    public final void onHide() {
    }

    @Override // X.C0ULX
    public final void onPause() {
    }

    @Override // X.C0ULX
    public final void onResume() {
    }

    @Override // X.C0ULX
    public final void onShow() {
    }

    private final C427760Gpy getAvatarStack() {
        return (C427760Gpy) findViewById(R.id.br7);
    }

    private final ImageView getCloseButton() {
        return (ImageView) findViewById(R.id.br9);
    }

    private final ImageView getPlaybookIcon() {
        return (ImageView) findViewById(R.id.qrm);
    }

    private final TextView getSubtitleView() {
        return (TextView) findViewById(R.id.bs_);
    }

    private final TextView getTitleView() {
        return (TextView) findViewById(R.id.bsc);
    }

    @Override // X.C0ULX
    public View getBannerView() {
        return findViewById(R.id.brb);
    }

    public /* synthetic */ C1091870eWH(Context context) {
        this(context, null, 0);
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R.id.br9);
        if (viewFindViewById != null) {
            C786410Ut5.I7(onClickListener, viewFindViewById);
        }
    }

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        Playbook playbook;
        PlaybookContent playbookContent;
        if (i == 6 && (obj instanceof Playbook) && (playbook = (Playbook) obj) != null && (playbookContent = playbook.content) != null) {
            String str = playbookContent.coverUrl;
            e0(new ImageModel(str, Collections.singletonList(str)), C418440Gaw.LIZIZ(4));
            getTitleView().setText(C497740JfY.LJIJI(2131855272));
            getSubtitleView().setText(playbookContent.title);
            return true;
        }
        return false;
    }

    public final void e0(ImageModel imageModel, float f) {
        if (imageModel == null) {
            return;
        }
        C500260Jjc.LLFFF(getPlaybookIcon());
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(f));
        c1324610kZfLJIIIZ.LJJI(getPlaybookIcon());
        if (C497740JfY.LJJ()) {
            C786410Ut5.Qb(getPlaybookIcon(), -1.0f);
        }
    }

    public C1091870eWH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C500260Jjc.LJIILL(R.layout.hh3, this, true);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        String str;
        boolean z;
        float fLIZIZ;
        List<String> listLIZ;
        Object objLJJJLL;
        ImageView.ScaleType scaleType;
        int i = 0;
        if (topRightBannerContainerComponent.titleText == null && topRightBannerContainerComponent.subtitleText == null) {
            return false;
        }
        Text text = topRightBannerContainerComponent.titleText;
        String str2 = null;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        Text text2 = topRightBannerContainerComponent.subtitleText;
        if (text2 != null) {
            str2 = text2.defaultPattern;
        }
        Spannable spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, str2);
        if (spannableLJIILIIL2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C500260Jjc.LJIILIIL(getSubtitleView());
            getTitleView().setMaxLines(2);
        } else {
            getSubtitleView().setText(spannableLJIILIIL2);
        }
        if (spannableLJIILIIL.length() == 0) {
            C500260Jjc.LJIILIIL(getTitleView());
        } else {
            getTitleView().setText(spannableLJIILIIL);
        }
        if (getTitleView().getText().length() == 0 && getSubtitleView().getText().length() == 0) {
            return false;
        }
        int i2 = topRightBannerContainerComponent.type;
        if (i2 != 6) {
            if (i2 != 7) {
                View viewFindViewById = findViewById(R.id.bs6);
                View viewFindViewById2 = findViewById(R.id.bs5);
                if (topRightBannerContainerComponent.image != null) {
                    C500260Jjc.LLFFF(viewFindViewById2);
                    C500260Jjc.LLFFF(viewFindViewById);
                    ImagePadding imagePadding = topRightBannerContainerComponent.imagePadding;
                    if (imagePadding != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
                        marginLayoutParams.setMarginStart(Math.max(C439101nJ.LIZ(imagePadding.left), 0));
                        marginLayoutParams.topMargin = Math.max(C439101nJ.LIZ(imagePadding.top), 0);
                        marginLayoutParams.setMarginEnd(Math.max(C439101nJ.LIZ(imagePadding.right), 0));
                        marginLayoutParams.bottomMargin = Math.max(C439101nJ.LIZ(imagePadding.bottom), 0);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
                        viewFindViewById2.setLayoutParams(marginLayoutParams);
                    }
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(topRightBannerContainerComponent.image);
                    if (BannerImageLoadDefaultTypeSetting.INSTANCE.enable()) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                    }
                    switch (topRightBannerContainerComponent.imageModeScaleAndroid) {
                        case 0:
                            scaleType = ImageView.ScaleType.CENTER_CROP;
                            break;
                        case 1:
                            scaleType = ImageView.ScaleType.MATRIX;
                            break;
                        case 2:
                            scaleType = ImageView.ScaleType.FIT_XY;
                            break;
                        case 3:
                            scaleType = ImageView.ScaleType.FIT_START;
                            break;
                        case 4:
                            scaleType = ImageView.ScaleType.FIT_CENTER;
                            break;
                        case 5:
                            scaleType = ImageView.ScaleType.FIT_END;
                            break;
                        case 6:
                            scaleType = ImageView.ScaleType.CENTER;
                            break;
                        case 7:
                            scaleType = ImageView.ScaleType.CENTER_INSIDE;
                            break;
                    }
                    c1324610kZfLJIIIZ.LJIJJ = scaleType;
                    c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
                    c1324610kZfLJIIIZ.LJJI(viewFindViewById2);
                    if (C497740JfY.LJJ()) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
                        viewFindViewById2.setScaleX(-1.0f);
                    }
                } else {
                    C500260Jjc.LJIILIIL(viewFindViewById);
                }
            } else {
                Map<String, String> map = topRightBannerContainerComponent.extra;
                if (!map.isEmpty()) {
                    getAvatarStack().setTotalCount(2);
                    getAvatarStack().setStacking(EnumC429060Gs4.LAST_ON_TOP);
                    ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
                    if (avatarThumb != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && (objLJJJLL = C13LP.LJJJLL(listLIZ)) != null) {
                        C427760Gpy.LIZ(getAvatarStack(), 0, objLJJJLL, "", null, null, false, null, 2040);
                        String str3 = map.get("guest_avatar");
                        if (str3 != null) {
                            C427760Gpy.LIZ(getAvatarStack(), 1, str3, "", null, null, false, null, 2040);
                            C500260Jjc.LLFFF(getAvatarStack());
                        }
                    }
                }
            }
        } else {
            float f = topRightBannerContainerComponent.imageCornerRadius;
            if (f == 0.0f) {
                fLIZIZ = C418440Gaw.LIZIZ(4);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f));
            }
            e0(topRightBannerContainerComponent.image, fLIZIZ);
        }
        ImageView closeButton = getCloseButton();
        if (!topRightBannerContainerComponent.hasCloseButton) {
            i = 8;
        }
        C786410Ut5.LJZI(i, closeButton);
        return true;
    }
}
