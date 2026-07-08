package X;

import Y.ACListenerS151S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.api.component.anole.service.AnoleBusinessServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1007560cKI extends AbstractC1014240cV4 implements View.OnClickListener {
    public final ConcurrentHashMap<Integer, Object> LLJLIL;
    public final C0H9Y LLJLILLLLZIIL;
    public Pair<Integer, Integer> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnoleAdCardModel LJJ() {
        return (AnoleAdCardModel) this.LLJLLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLJLIL.clear();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        List<AnoleProductModel> productList;
        AnoleAdCardModel anoleAdCardModelLJJ = LJJ();
        if (anoleAdCardModelLJJ != null && (productList = anoleAdCardModelLJJ.getProductList()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H9V(productList, this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1007560cKI.onClick(android.view.View):void");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        GradientDrawable gradientDrawable;
        int[] iArr;
        List<String> defaultBgColorList;
        int iIntValue;
        super.Fk(viewGroup, interfaceC1014340cVE);
        View view = this.LLJJIJIL;
        List<AnoleProductModel> list = null;
        if (view != null) {
            Pair<Integer, Integer> pair = this.LLJLL;
            if (pair == null) {
                AnoleAdCardModel anoleAdCardModelLJJ = LJJ();
                if (anoleAdCardModelLJJ != null && (defaultBgColorList = anoleAdCardModelLJJ.getDefaultBgColorList()) != null && defaultBgColorList.size() == 2) {
                    iArr = new int[2];
                    C1022030chd c1022030chd = C1022030chd.LIZ;
                    String str = (String) ListProtector.get(defaultBgColorList, 0);
                    c1022030chd.getClass();
                    Integer numLJIIL = C1022030chd.LJIIL(str);
                    int iIntValue2 = -1;
                    if (numLJIIL != null) {
                        iIntValue = numLJIIL.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    iArr[0] = iIntValue;
                    Integer numLJIIL2 = C1022030chd.LJIIL((String) ListProtector.get(defaultBgColorList, 1));
                    if (numLJIIL2 != null) {
                        iIntValue2 = numLJIIL2.intValue();
                    }
                    iArr[1] = iIntValue2;
                } else {
                    iArr = new int[]{-1, -1};
                }
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
            } else {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{pair.getFirst().intValue(), pair.getSecond().intValue()});
            }
            gradientDrawable.setShape(0);
            view.setBackground(gradientDrawable);
        }
        AnoleAdCardModel anoleAdCardModelLJJ2 = LJJ();
        if (anoleAdCardModelLJJ2 != null) {
            C0H9Y c0h9y = this.LLJLILLLLZIIL;
            c0h9y.setShowFooter(false);
            List<AnoleProductModel> productList = anoleAdCardModelLJJ2.getProductList();
            if (C19719512Dh.LJI(productList)) {
                list = productList;
            }
            c0h9y.setData(list);
            c0h9y.LLILLL = anoleAdCardModelLJJ2;
            c0h9y.LLILLJJLI = this.LLILLJJLI.LIZLLL;
            c0h9y.LL = this.LLJLIL;
        }
    }

    public ViewOnClickListenerC1007560cKI(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Aweme aweme;
        String nickname;
        int iIntValue;
        C21279718Pj sponsorLabelFromXml;
        User author;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = new ConcurrentHashMap<>();
        C0H9Y c0h9y = new C0H9Y();
        this.LLJLILLLLZIIL = c0h9y;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 978));
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 977));
        this.LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 976));
        final C1007570cKJ c1007570cKJ = new C1007570cKJ(context);
        AnoleAdCardModel anoleAdCardModelLJJ = LJJ();
        if (anoleAdCardModelLJJ != null) {
            ACListenerS151S0100000_16 aCListenerS151S0100000_16 = new ACListenerS151S0100000_16(this, 167);
            Object obj = c1009340cNA.LIZJ;
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            TuxTextView advertiserNicknameTvFromXml = c1007570cKJ.getAdvertiserNicknameTvFromXml();
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            } else {
                nickname = null;
            }
            advertiserNicknameTvFromXml.setText(nickname);
            c1007570cKJ.getAdvertiserDescTvFromXml().setText(anoleAdCardModelLJJ.getTitle());
            c1007570cKJ.getNoInterestBtnFromXml().setText(anoleAdCardModelLJJ.getNoInterestedButtonText());
            C197039127h noInterestBtnFromXml = c1007570cKJ.getNoInterestBtnFromXml();
            AnoleBusinessServiceImpl.LIZLLL().LIZ();
            noInterestBtnFromXml.setTag(R.id.ekt, Boolean.TRUE);
            c1007570cKJ.getSeeMoreBtnFromXml().setText(anoleAdCardModelLJJ.getViewMoreButtonText());
            if (c1007570cKJ.getSponsorLabelFromXml() != null) {
                C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
                AwemeRawAd awemeRawAd = c1009340cNA.LIZLLL;
                if (awemeRawAd.getLabel().getStyleType() == 1) {
                    c21279518PhLIZ.LJIILJJIL(92);
                    c21279518PhLIZ.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    c21279518PhLIZ.LIZ(C475630Ikz.LIZIZ(R.attr.ei, c1007570cKJ.getContext()));
                } else {
                    c21279518PhLIZ.LJIILJJIL(82);
                    c21279518PhLIZ.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                    c21279518PhLIZ.LIZ(C475630Ikz.LIZIZ(R.attr.zg, c1007570cKJ.getContext()));
                }
                c21279518PhLIZ.LJIILIIL(C475630Ikz.LIZIZ(R.attr.ee, c1007570cKJ.getContext()));
                c21279518PhLIZ.LJIIL(awemeRawAd.getLabel().getLabelName());
                c21279518PhLIZ.LIZIZ(C12ES.LIZJ(4.0f, c1007570cKJ.getContext()));
                C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
                if (c21279618Pi != null && (sponsorLabelFromXml = c1007570cKJ.getSponsorLabelFromXml()) != null) {
                    sponsorLabelFromXml.LIZ(c21279618Pi);
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZA(aweme, c1007570cKJ, "vsa_full_screen_card", null), 3);
            String cardBgColor = anoleAdCardModelLJJ.getCardBgColor();
            LinearLayout contentFromXml = c1007570cKJ.getContentFromXml();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
            C1022030chd.LIZ.getClass();
            Integer numLJIIL = C1022030chd.LJIIL(cardBgColor);
            if (numLJIIL != null) {
                iIntValue = numLJIIL.intValue();
            } else {
                iIntValue = -1;
            }
            gradientDrawable.setColor(iIntValue);
            contentFromXml.setBackground(gradientDrawable);
            Context context2 = c1007570cKJ.getContext();
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_heart_broken);
            c1247530iZL.LIZIZ(2131830708);
            c1247530iZL.LJ = aCListenerS151S0100000_16;
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LIZJ(R.raw.icon_flag);
            c1247530iZL2.LIZIZ(R.string.s65);
            c1247530iZL2.LIZ(new AwS382S0200000_16(context2, c1009340cNA, 101));
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZJ(R.raw.icon_info_circle);
            c1247530iZL3.LIZIZ(2131834909);
            c1247530iZL3.LIZ(new AwS595S0100000_16(c1009340cNA, 384));
            c1390850mIV.LIZ(c1247530iZL, c1247530iZL2, c1247530iZL3);
            c1007570cKJ.LLJILJIL = c1390850mIV.LIZJ();
            c1007570cKJ.getLongPressLayoutFromXml().setListener(new InterfaceC690460R6m() { // from class: X.0cKK
                @Override // X.InterfaceC690460R6m
                public final void LIZ(float f, float f2) {
                    C19EG c19egLIZIZ;
                    FragmentManager supportFragmentManager;
                    Activity activityLIZ = C2421209eE.LIZ();
                    if (activityLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        TuxActionSheet tuxActionSheet = c1007570cKJ.LLJILJIL;
                        if (tuxActionSheet == null) {
                            tuxActionSheet = null;
                        }
                        tuxActionSheet.show(supportFragmentManager, "AnoleAdCardView");
                    }
                }
            });
            C786410Ut5.G9(c1007570cKJ.getAdvertiserHeaderIvFromXml(), this);
            C786410Ut5.h9(c1007570cKJ.getAdvertiserDescTvFromXml(), this);
            C786410Ut5.h9(c1007570cKJ.getAdvertiserNicknameTvFromXml(), this);
            C786410Ut5.O8(c1007570cKJ.getSponsorLabelFromXml(), this);
            C786410Ut5.U8(c1007570cKJ.getNoInterestBtnFromXml(), this);
            C786410Ut5.U8(c1007570cKJ.getSeeMoreBtnFromXml(), this);
            C786410Ut5.a9(c1007570cKJ.getIvSwipeUpFromXml(), this);
            c1007570cKJ.getRvCardContentFromXml().setLayoutManager(new WrapGridLayoutManager(2, 1, c1007570cKJ.getContext(), false));
            RecyclerView rvCardContentFromXml = c1007570cKJ.getRvCardContentFromXml();
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
            rvCardContentFromXml.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DXN
                public final int LL = 2;
                public final int LLILLJJLI;

                {
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int i = childAdapterPosition % this.LL;
                    if (!C444960Hcc.LIZIZ()) {
                        int i2 = this.LLILLJJLI;
                        int i3 = this.LL;
                        rect.left = (i * i2) / i3;
                        rect.right = i2 - (((i + 1) * i2) / i3);
                    } else {
                        int i4 = this.LLILLJJLI;
                        int i5 = this.LL;
                        rect.right = (i * i4) / i5;
                        rect.left = i4 - (((i + 1) * i4) / i5);
                    }
                    if (childAdapterPosition >= this.LL) {
                        rect.top = this.LLILLJJLI;
                    }
                }
            });
            c1007570cKJ.getRvCardContentFromXml().setAdapter(c0h9y);
        }
        this.LLJJIJIL = c1007570cKJ;
    }
}
