package X;

import Y.ACListenerS113S0200000_9;
import Y.ARunnableS109S0100000_9;
import Y.ATListenerS337S0200000_9;
import Y.ATListenerS443S0100000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEditEventGamePlayAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.IBulletinQuickPublishAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinQuickPostCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinPostTypeAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBubbleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S0700000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0P4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639010P4p implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;

    public static final void A3$1(C639010P4p c639010P4p, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Bh$1(C639010P4p c639010P4p, Uri uri, View view) {
    }

    public static final void e1$1(C639010P4p c639010P4p, Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                C0OPX.LJII("image display intermediate");
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                C0OPX.LJII("image display start");
                break;
            case 1:
                Bh$1(this, uri, view);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                C0OPX.LJIIIIZZ("image display failed");
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                C0OPX.LJII("image display release");
                break;
            case 1:
                e1$1(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                C0OPX.LJIIIIZZ("image display failed");
                break;
            case 1:
                lg$1(this, uri, th);
                break;
        }
    }

    public C639010P4p(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void lg$1(C639010P4p c639010P4p, Uri uri, Throwable th) {
        BulletinTooltipAbility bulletinTooltipAbility;
        BulletinPublishAction item = ((BulletinQuickPostCell) c639010P4p.l0).getItem();
        if (item != null && item.getBubbleStruct() != null && (bulletinTooltipAbility = (BulletinTooltipAbility) ((BulletinQuickPostCell) c639010P4p.l0).LLILZLL.getValue()) != null) {
            bulletinTooltipAbility.WK0(EnumC619900OTc.GAMEPLAY_ACB_TOOLTIP);
        }
    }

    public static final void cm$1(C639010P4p c639010P4p, Uri uri, View view, Throwable th) {
        BulletinTooltipAbility bulletinTooltipAbility;
        BulletinPublishAction item = ((BulletinQuickPostCell) c639010P4p.l0).getItem();
        if (item != null && item.getBubbleStruct() != null && (bulletinTooltipAbility = (BulletinTooltipAbility) ((BulletinQuickPostCell) c639010P4p.l0).LLILZLL.getValue()) != null) {
            bulletinTooltipAbility.WK0(EnumC619900OTc.GAMEPLAY_ACB_TOOLTIP);
        }
    }

    public static final void Ad$0(C639010P4p c639010P4p, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_gameplay_second_function_setting", true, true)) {
            return;
        }
        HandlerHook.viewPost(((BulletinEditEventGamePlayAssem) c639010P4p.l0).Jo(), new ARunnableS109S0100000_9((BulletinEditEventGamePlayAssem) c639010P4p.l0, 89));
    }

    public static final void Ad$1(C639010P4p c639010P4p, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        final BulletinBubbleStruct bubbleStruct;
        final BulletinPublishAction item = ((BulletinQuickPostCell) c639010P4p.l0).getItem();
        if (item != null && (bubbleStruct = item.getBubbleStruct()) != null) {
            final BulletinQuickPostCell bulletinQuickPostCell = (BulletinQuickPostCell) c639010P4p.l0;
            BulletinTooltipAbility bulletinTooltipAbility = (BulletinTooltipAbility) bulletinQuickPostCell.LLILZLL.getValue();
            if (bulletinTooltipAbility != null) {
                bulletinTooltipAbility.gA2(EnumC619900OTc.GAMEPLAY_ACB_TOOLTIP, new InterfaceC619970OTj() { // from class: X.0OVv
                    @Override // X.InterfaceC619970OTj
                    public final boolean isAvailable() {
                        return C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_gameplay_second_function_setting", true, true);
                    }

                    @Override // X.InterfaceC619970OTj
                    public final void q0(final Function0<Unit> function0) {
                        final C19EG activity;
                        IBulletinQuickPublishAbility iBulletinQuickPublishAbility;
                        BulletinPostTypeAbility bulletinPostTypeAbility;
                        String strJ51;
                        Fragment currentFragment = bulletinQuickPostCell.getCurrentFragment();
                        if (currentFragment != null && (activity = currentFragment.getActivity()) != null) {
                            final String str = bubbleStruct.id;
                            final String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            BulletinCommonAbility bulletinCommonAbility = (BulletinCommonAbility) bulletinQuickPostCell.LLILZIL.getValue();
                            if (bulletinCommonAbility != null && (strJ51 = bulletinCommonAbility.J51()) != null) {
                                str2 = strJ51;
                            }
                            BulletinQuickPostCell bulletinQuickPostCell2 = bulletinQuickPostCell;
                            if (bulletinQuickPostCell2.LLILLL.getValue() == null ? !(bulletinQuickPostCell2.LLILZ.getValue() == null || (iBulletinQuickPublishAbility = (IBulletinQuickPublishAbility) bulletinQuickPostCell2.LLILZ.getValue()) == null || !iBulletinQuickPublishAbility.Lq()) : !((bulletinPostTypeAbility = (BulletinPostTypeAbility) bulletinQuickPostCell2.LLILLL.getValue()) == null || !bulletinPostTypeAbility.Lq())) {
                                final BulletinQuickPostCell bulletinQuickPostCell3 = bulletinQuickPostCell;
                                View view2 = bulletinQuickPostCell3.itemView;
                                final BulletinBubbleStruct bulletinBubbleStruct = bubbleStruct;
                                final BulletinPublishAction bulletinPublishAction = item;
                                HandlerHook.viewPost(view2, new Runnable() { // from class: X.0OZU
                                    /* JADX WARN: Type inference failed for: r14v0, types: [X.0OVN] */
                                    /* JADX WARN: Type inference failed for: r7v0, types: [X.0OZV, android.view.View] */
                                    public final void LIZ() {
                                        ViewGroup viewGroup;
                                        C19EG c19eg = activity;
                                        View view3 = bulletinQuickPostCell3.itemView;
                                        Context context = view3.getContext();
                                        BulletinBubbleStruct bulletinBubbleStruct2 = bulletinBubbleStruct;
                                        final String str3 = str;
                                        final String str4 = str2;
                                        final BulletinQuickPostCell bulletinQuickPostCell4 = bulletinQuickPostCell3;
                                        final BulletinPublishAction bulletinPublishAction2 = bulletinPublishAction;
                                        final Function0<Unit> function02 = function0;
                                        ?? r14 = new C0OZT() { // from class: X.0OVN
                                            @Override // X.C0OZT
                                            public final void LIZ() {
                                                function02.invoke();
                                            }

                                            @Override // X.C0OZT
                                            public final void LIZIZ() {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(new EventExtra("bubble_id", str3));
                                                arrayList.add(new EventExtra("activity_id", str4));
                                                ((BulletinProfileViewModel) bulletinQuickPostCell4.LLIZ.getValue()).VQ2(C0OM6.ACTIVITY_POST_BUBBLE, C0ONE.SHOW, arrayList);
                                            }

                                            @Override // X.C0OZT
                                            public final void LIZJ() {
                                                bulletinQuickPostCell4.Yl(bulletinPublishAction2.getPublishActionType(), bulletinPublishAction2.getSchema(), bulletinPublishAction2.getExtra(), true);
                                            }
                                        };
                                        View decorView = c19eg.getWindow().getDecorView();
                                        if (!(decorView instanceof ViewGroup) || (viewGroup = (ViewGroup) decorView) == null) {
                                            return;
                                        }
                                        View view4 = new View(context);
                                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, context);
                                        view4.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                                        viewGroup.addView(view4, new FrameLayout.LayoutParams(-1, -1));
                                        ImageView imageView = new ImageView(c19eg);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view3.getWidth(), view3.getHeight(), Bitmap.Config.ARGB_8888);
                                        Drawable background = view3.getBackground();
                                        try {
                                            view3.setBackground(C1308910kAL.LJ(R.attr.a1d, imageView.getContext()));
                                            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view3);
                                            view3.setBackground(background);
                                            C443530HaJ c443530HaJ = new C443530HaJ(context.getResources(), bitmapCreateBitmap);
                                            c443530HaJ.LIZJ(C418440Gaw.LIZIZ(20));
                                            imageView.setImageDrawable(c443530HaJ);
                                            int[] iArr = new int[2];
                                            view3.getLocationInWindow(iArr);
                                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view3.getWidth(), view3.getHeight());
                                            layoutParams.leftMargin = iArr[0];
                                            layoutParams.topMargin = iArr[1];
                                            ?? r7 = new FrameLayout(context) { // from class: X.0OZV
                                                public final C01GW LL;
                                                public final C01GW LLILLJJLI;
                                                public final C01GW LLILLL;
                                                public final C01GW LLILZ;

                                                private final ImageView getIconImageView() {
                                                    return (ImageView) this.LLILLJJLI.getValue();
                                                }

                                                private final TuxTextView getMessageTextView() {
                                                    return (TuxTextView) this.LLILZ.getValue();
                                                }

                                                private final LinearLayout getRootView() {
                                                    return (LinearLayout) this.LL.getValue();
                                                }

                                                private final TuxTextView getTitleTextView() {
                                                    return (TuxTextView) this.LLILLL.getValue();
                                                }

                                                {
                                                    super(context, null);
                                                    this.LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1696));
                                                    this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1694));
                                                    this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1697));
                                                    this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1695));
                                                    C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a7v, this, true);
                                                    LinearLayout rootView = getRootView();
                                                    C384050F3z c384050F3z = new C384050F3z();
                                                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                                                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                                                    rootView.setBackground(c384050F3z.LIZ(context));
                                                }

                                                public final void LIZ(TuxImageModel tuxImageModel, String str5, String str6) {
                                                    ImageUrlModel imageUrlModelLIZIZ;
                                                    if (tuxImageModel != null) {
                                                        imageUrlModelLIZIZ = C0OSD.LIZIZ(getContext(), tuxImageModel);
                                                    } else {
                                                        imageUrlModelLIZIZ = null;
                                                    }
                                                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
                                                    c1331670kl3LJIIIIZZ.LJJI(getIconImageView());
                                                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                                                    getTitleTextView().setText(str5);
                                                    getMessageTextView().setText(str6);
                                                }
                                            };
                                            TuxImageModel tuxImageModel = bulletinBubbleStruct2.iconUrl;
                                            String str5 = bulletinBubbleStruct2.title;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            String str6 = bulletinBubbleStruct2.content;
                                            r7.LIZ(tuxImageModel, str5, str6 != null ? str6 : "");
                                            C118300cf c118300cf = new C118300cf();
                                            C1391540mJc c1391540mJc = new C1391540mJc(context);
                                            c1391540mJc.LLILZIL = r7;
                                            c1391540mJc.LLILLJJLI.LIZIZ = view3;
                                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                            C1391600mJi c1391600mJi = c1391540mJc.LLILLJJLI;
                                            c1391600mJi.LJIIIIZZ = iLIZIZ;
                                            c1391600mJi.LJIIL = true;
                                            c1391540mJc.LJ(new AwS553S0100000_9((C0OVN) r14, 1797));
                                            c1391540mJc.LIZJ(new AwS2S0700000_9(viewGroup, view4, imageView, c118300cf, context, bulletinBubbleStruct2, (C0OVN) r14, 1));
                                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4));
                                            C1391600mJi c1391600mJi2 = c1391540mJc.LLILLJJLI;
                                            c1391600mJi2.LJFF = iLIZIZ2;
                                            c1391600mJi2.LJII = 3000L;
                                            C0P0T c0p0tLIZIZ = c1391540mJc.LIZIZ();
                                            c0p0tLIZIZ.LJJII(true, new ACListenerS113S0200000_9(c118300cf, c0p0tLIZIZ, 48));
                                            view4.setOnTouchListener(new ATListenerS443S0100000_9(c0p0tLIZIZ, 5));
                                            imageView.setOnTouchListener(new ATListenerS337S0200000_9(c118300cf, c0p0tLIZIZ, 2));
                                            c0p0tLIZIZ.show();
                                            viewGroup.addView(imageView, layoutParams);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            view3.setBackground(background);
                                            throw th;
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("BulletinQuickPostCell@8402.tryRegisterTooltip$1$show$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("BulletinQuickPostCell@8402.tryRegisterTooltip$1$show$1");
                                    }
                                });
                                return;
                            }
                            function0.invoke();
                            return;
                        }
                        function0.invoke();
                    }
                });
            }
        }
    }
}
