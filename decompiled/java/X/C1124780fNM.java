package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS50S0300000_17;
import Y.AfS138S0000000_16;
import Y.AfS186S0100000_17;
import Y.AfS36S1000000_17;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124780fNM extends ConstraintLayout implements C0T8B {
    public boolean LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public boolean LLILZLL;
    public InterfaceC420801kM LLIZ;
    public final C01GW LLIZLLLIL;

    private final C1124810fNP getCollaborativeGiftBannerController() {
        return (C1124810fNP) this.LLIZLLLIL.getValue();
    }

    @Override // X.C0T8B
    public final boolean h() {
        return (this.LL || this.LLILLL.getVisibility() == 0) ? false : true;
    }

    public final void l0() {
        C786410Ut5.D8(this, new View.OnClickListener() { // from class: X.0fNO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        setBackgroundResource(R.drawable.dtf);
        C500260Jjc.LJIILIIL(this.LLILZIL);
        this.LLILZ.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, getContext()));
        this.LLILZIL.setTextColor(C497740JfY.LIZLLL(R.attr.fxe, getContext()));
        this.LLILLL.clearColorFilter();
        this.LL = false;
    }

    public final void u0() {
        String strLJIJJ = C497740JfY.LJIJJ(2131852585, Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).DV0()));
        l0();
        C786410Ut5.LJZI(0, this.LLILLJJLI);
        C786410Ut5.LJZI(8, this.LLILLL);
        C786410Ut5.LLJJJJ(this.LLILZ, 0);
        ImageView imageView = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.height = C439101nJ.LIZ(24);
        marginLayoutParams.width = C439101nJ.LIZ(24);
        marginLayoutParams.setMarginStart(0);
        C786410Ut5.c6(imageView, marginLayoutParams);
        this.LLILZ.LJJJI(R.style.a9a);
        C16F5 c16f5 = this.LLILZ;
        c16f5.setTextColor(C20736316Cj.LIZJ(R.attr.cd_, c16f5));
        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_4", "ttlive_match_vault_glove_banner_icon.png");
        this.LLILZ.setText(strLJIJJ);
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void j0() {
        getCollaborativeGiftBannerController().LJFF.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZLL = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL = true;
        InterfaceC420801kM interfaceC420801kM = this.LLIZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0fNN] */
    public final void p0() {
        InterfaceC420801kM c11nj;
        Object obj;
        C1124870fNV.LIZJ().getClass();
        if (!C1124870fNV.LIZLLL()) {
            C1124870fNV.LIZJ().getClass();
            h0(C1124870fNV.LIZIZ("pm_mt_match_gift_option_gift_panel_banner"));
            return;
        }
        InterfaceC420801kM interfaceC420801kM = this.LLIZ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        ?? r4 = new C092O() { // from class: X.0fNN
            @Override // X.C092O
            public final void accept(Object obj2) {
                this.LIZ.h0((String) obj2);
            }
        };
        c1124870fNVLIZJ.getClass();
        if (C1124870fNV.LIZLLL()) {
            if (C1124820fNQ.LIZJ == null) {
                C1124820fNQ.LIZJ = new C1124820fNQ();
            }
            C1124820fNQ c1124820fNQ = C1124820fNQ.LIZJ;
            if (c1124820fNQ.LIZ.containsKey("pm_mt_match_gift_option_gift_panel_banner")) {
                obj = c1124820fNQ.LIZ.get("pm_mt_match_gift_option_gift_panel_banner");
            } else {
                if (((ConcurrentHashMap) c1124820fNQ.LIZIZ).containsKey("pm_mt_match_gift_option_gift_panel_banner")) {
                    obj = ((ConcurrentHashMap) c1124820fNQ.LIZIZ).get("pm_mt_match_gift_option_gift_panel_banner");
                }
                c11nj = C11NZ.LJIJJLI(new C1151870g53(c1124820fNQ, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS36S1000000_17(1)).LJJLL(new AfS186S0100000_17((C1124790fNN) r4, 51), new AfS186S0100000_17((C1124790fNN) r4, 52));
            }
            if (obj == null) {
                c11nj = C11NZ.LJIJJLI(new C1151870g53(c1124820fNQ, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS36S1000000_17(1)).LJJLL(new AfS186S0100000_17((C1124790fNN) r4, 51), new AfS186S0100000_17((C1124790fNN) r4, 52));
            } else if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                r4.accept(obj);
                c11nj = new C11NJ();
            } else {
                c11nj = C11NZ.LJJJJZ(obj).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0000000_16(6), new AfS36S1000000_17(0));
            }
        } else {
            c11nj = new C11NJ();
        }
        this.LLIZ = c11nj;
    }

    public final C16F5 getGiftDescriptionSubtitleTv$livegift_impl_release() {
        return this.LLILZIL;
    }

    public final C16F5 getGiftDescriptionTv$livegift_impl_release() {
        return this.LLILZ;
    }

    public final ImageView getLeftIcon$livegift_impl_release() {
        return this.LLILLJJLI;
    }

    public final ImageView getSubscriptionArrows$livegift_impl_release() {
        return this.LLILLL;
    }

    public final void h0(String str) {
        l0();
        C786410Ut5.LJZI(0, this.LLILLJJLI);
        C786410Ut5.LJZI(8, this.LLILLL);
        C786410Ut5.LLJJJJ(this.LLILZ, 0);
        ImageView imageView = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.height = C439101nJ.LIZ(24);
        marginLayoutParams.width = C439101nJ.LIZ(24);
        marginLayoutParams.setMarginStart(0);
        C786410Ut5.c6(imageView, marginLayoutParams);
        this.LLILZ.LJJJI(R.style.a9a);
        C16F5 c16f5 = this.LLILZ;
        c16f5.setTextColor(C20736316Cj.LIZJ(R.attr.cd_, c16f5));
        C1143680frq.LIZLLL(this.LLILLJJLI, C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_revenue_demand_1"), "ttlive_match_gift_banner_icon.png");
        this.LLILZ.setText(str);
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
    }

    public final void s0(boolean z) {
        String str;
        String strLJIJI = C497740JfY.LJIJI(2131853753);
        l0();
        C786410Ut5.LJZI(0, this.LLILLJJLI);
        C786410Ut5.LJZI(0, this.LLILLL);
        C786410Ut5.LLJJJJ(this.LLILZ, 0);
        ImageView imageView = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.height = C439101nJ.LIZ(24);
        marginLayoutParams.width = C439101nJ.LIZ(24);
        marginLayoutParams.setMarginStart(0);
        C786410Ut5.c6(imageView, marginLayoutParams);
        this.LLILZ.LJJJI(R.style.a9a);
        C16F5 c16f5 = this.LLILZ;
        c16f5.setTextColor(C20736316Cj.LIZJ(R.attr.cd_, c16f5));
        if (z) {
            str = "ttlive_match_top2_gift_banner_icon.png";
        } else {
            str = "ttlive_match_top3_gift_banner_icon.png";
        }
        C1143680frq.LIZLLL(this.LLILLJJLI, C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_revenue_demand_1"), str);
        this.LLILZ.setText(strLJIJI);
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
    }

    public final void setBannerClickListener(Function0<Unit> function0) {
        C786410Ut5.D8(this, new ACListenerS152S0100000_17(function0, 47));
    }

    public final void setData(GiftPanelBanner giftPanelBanner) {
        float fIntValue;
        TextFormat textFormat;
        Integer num;
        List<TextPiece> list;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        String str;
        List<String> list2;
        int i;
        int i2;
        C500260Jjc.LJIILIIL(this.LLILZIL);
        this.LLILZ.animate().cancel();
        this.LLILZ.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, getContext()));
        this.LLILZIL.setTextColor(C497740JfY.LIZLLL(R.attr.fxe, getContext()));
        this.LLILLL.clearColorFilter();
        if (giftPanelBanner.leftIcon != null) {
            C500260Jjc.LLFFF(this.LLILLJJLI);
            C1117830fC9.LIZLLL(this.LLILLJJLI, giftPanelBanner.leftIcon, getLayoutParams().width, getLayoutParams().height);
            ImageView imageView = this.LLILLJJLI;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            ImageModel imageModel2 = giftPanelBanner.leftIcon;
            if (imageModel2 != null) {
                i = imageModel2.height;
            } else {
                i = 48;
            }
            marginLayoutParams.height = C439101nJ.LIZ(i);
            ImageModel imageModel3 = giftPanelBanner.leftIcon;
            if (imageModel3 != null) {
                i2 = imageModel3.width;
            } else {
                i2 = 48;
            }
            marginLayoutParams.width = C439101nJ.LIZ(i2);
            int iLIZ = marginLayoutParams.height;
            if (iLIZ == 0) {
                iLIZ = C439101nJ.LIZ(48);
            }
            marginLayoutParams.height = iLIZ;
            int iLIZ2 = marginLayoutParams.width;
            if (iLIZ2 == 0) {
                iLIZ2 = C439101nJ.LIZ(48);
            }
            marginLayoutParams.width = iLIZ2;
            marginLayoutParams.setMarginStart(0);
            C786410Ut5.c6(imageView, marginLayoutParams);
        } else {
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
        }
        if (!CollectionUtil.isListEmpty(giftPanelBanner.bgColors)) {
            List<String> list3 = giftPanelBanner.bgColors;
            String str2 = null;
            if (list3 != null) {
                str = (String) ListProtector.get(list3, 0);
            } else {
                str = null;
            }
            List<String> list4 = giftPanelBanner.bgColors;
            if (list4 != null && list4.size() > 1 && (list2 = giftPanelBanner.bgColors) != null) {
                str2 = (String) ListProtector.get(list2, 1);
            }
            if (str != null && ((str.length() == 7 || str.length() == 9) && Pattern.matches("#[0-9a-fA-F]+", str))) {
                setBackground(i0(str, str2));
            }
            this.LL = true;
        } else {
            setBackgroundResource(R.drawable.dtf);
            this.LL = false;
        }
        final Text text = giftPanelBanner.displayText;
        if (text != null) {
            final C16F5 c16f5 = this.LLILZ;
            C244400x0.LIZ.getClass();
            CharSequence charSequenceLIZ = C244400x0.LIZ(text);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("displayText=");
            sbLIZ.append(text.defaultPattern);
            sbLIZ.append(" patternText=");
            sbLIZ.append((Object) charSequenceLIZ);
            C20441214yg.LIZIZ("huohuo", C2188811AlT.LIZIZ(sbLIZ));
            if ((charSequenceLIZ instanceof Spannable) && (list = text.pieces) != null) {
                for (TextPiece textPiece : list) {
                    if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (textPieceImage = textPiece.imageValue) != null && (imageModel = textPieceImage.imageModel) != null) {
                        ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModel, new InterfaceC177000m8() { // from class: X.0edZ
                            @Override // X.InterfaceC177000m8
                            public final void LIZ(Bitmap bitmap) {
                                if (bitmap != null && !bitmap.isRecycled() && !this.LIZ.LLILZLL) {
                                    C20441214yg.LIZIZ("huohuo", "load icon success");
                                    c16f5.setText(C1133830fbx.LJIILIIL(text, ""));
                                }
                            }
                        });
                    }
                }
            }
            c16f5.setText(charSequenceLIZ);
        }
        C16F5 c16f52 = this.LLILZ;
        Text text2 = giftPanelBanner.displayText;
        if (text2 != null && (textFormat = text2.defaultFormat) != null && (num = textFormat.fontSize) != null) {
            fIntValue = num.intValue();
        } else {
            fIntValue = 12.0f;
        }
        c16f52.setTextSize(1, fIntValue);
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
        if (C500260Jjc.LJJIIZ(giftPanelBanner.schemaUrl)) {
            this.LLILZ.setFadingEdgeLength((int) C497740JfY.LIZIZ(25.0f));
            C786410Ut5.LJZI(0, this.LLILLL);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILZ.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = 1.0f;
        } else {
            this.LLILZ.setFadingEdgeLength((int) C497740JfY.LIZIZ(22.0f));
            C786410Ut5.LJZI(8, this.LLILLL);
            this.LLILZ.getLayoutParams().width = -2;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.LLILZ.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
        }
        if (h()) {
            C1117830fC9.LIZ(0, this.LLILZ);
        } else {
            C1117830fC9.LIZ(C439101nJ.LIZ(8), this.LLILZ);
        }
    }

    public final void setDescriptionText(CharSequence charSequence) {
        if (!Intrinsics.LJFF(this.LLILZ.getText(), charSequence)) {
            this.LLILZ.animate().cancel();
            this.LLILZ.setText(charSequence);
        }
    }

    public final void setViewerWishesStyle(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        ImageModel imageModelLJII;
        l0();
        if (abstractC1126600fQI != null && (imageModelLJII = abstractC1126600fQI.LJII()) != null) {
            C1117830fC9.LIZLLL(this.LLILLJJLI, imageModelLJII, getLayoutParams().width, getLayoutParams().height);
        }
        int iLIZ = C439101nJ.LIZ(36);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams();
        if (marginLayoutParams.height != iLIZ || marginLayoutParams.width != iLIZ) {
            ImageView imageView = this.LLILLJJLI;
            marginLayoutParams.height = iLIZ;
            marginLayoutParams.width = iLIZ;
            C786410Ut5.c6(imageView, marginLayoutParams);
        }
        this.LLILZ.LJJJI(R.style.a9g);
        if (!this.LLILZ.isSelected()) {
            this.LLILZ.setSelected(true);
        }
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    public final boolean z0(long j) {
        Room room;
        User owner;
        String username;
        Gift fansClubGift = GiftService.LLILLJJLI.getFansClubGift();
        if (fansClubGift == null || fansClubGift.id != j || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || (owner = room.getOwner()) == null || (username = owner.getUsername()) == null) {
            return false;
        }
        C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(14);
        if (c1134410fctLJI != null && c1134410fctLJI.LJIIJJI() && EnumC1134460fcy.TASK_ENTER.beforeStatus(c1134410fctLJI.LIZJ())) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1096240edK(this, username, null), 3);
        }
        return true;
    }

    public C1124780fNM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(CharSequence charSequence, long j) {
        this.LLILZ.animate().cancel();
        C12DM c12dm = new C12DM();
        C16F5 c16f5 = this.LLILZ;
        c16f5.animate().setInterpolator(c12dm).setStartDelay(j).alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS50S0300000_17(c16f5, charSequence, c12dm, 5)).start();
    }

    public final Drawable i0(String str, String str2) {
        int iLJIIJ;
        int color = ColorProtector.parseColor(str);
        if (str2 != null && ((str2.length() == 7 || str2.length() == 9) && Pattern.matches("#[0-9a-fA-F]+", str2))) {
            iLJIIJ = ColorProtector.parseColor(str2);
        } else {
            iLJIIJ = C2441009hQ.LJIIJ(C2441009hQ.LJIIL(color, 153), -13816531);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{color, iLJIIJ});
        gradientDrawable.setShape(0);
        float f = 8;
        gradientDrawable.setCornerRadii(new float[]{C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        return gradientDrawable;
    }

    public C1124780fNM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(this, 164));
        ViewGroup.inflate(context, R.layout.hzm, this);
        this.LLILLJJLI = (ImageView) findViewById(R.id.mk3);
        this.LLILLL = (ImageView) findViewById(R.id.wit);
        this.LLILZ = (C16F5) findViewById(R.id.iwr);
        this.LLILZIL = (C16F5) findViewById(R.id.iwt);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r17, com.bytedance.ies.sdk.datachannel.DataChannel r18, androidx.lifecycle.LifecycleOwner r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124780fNM.n0(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.lifecycle.LifecycleOwner, boolean):void");
    }
}
