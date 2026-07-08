package X;

import Y.ARunnableS79S0200000_10;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0Pzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663230Pzt extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final View LLIZ;
    public final C424700Gl2 LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxIconView LLJI;
    public String LLJIJIL;

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final View getView() {
        return this.itemView;
    }

    public final void P5(final SearchOperation searchOperation) {
        String str = searchOperation.docId;
        if (str == null) {
            str = "";
        }
        this.LLJIJIL = str;
        l3().LJJLI = new AwS589S0100000_10(this, 551);
        if (!searchOperation.recorded) {
            C0PPS.LIZ(this.itemView, new ARunnableS79S0200000_10(this, searchOperation, 80));
            searchOperation.setRecorded(true);
        }
        C424700Gl2 c424700Gl2 = this.LLIZLLLIL;
        UrlModel urlModel = searchOperation.banner;
        c424700Gl2.getClass();
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            c424700Gl2.LLILLL = urlModel;
            c424700Gl2.getHierarchy().LJIJ(null, 0);
            C1323050kX9<Bitmap> c1323050kX9LIZJ = C0QD7.LIZ.LIZJ(c424700Gl2.getUrl());
            c424700Gl2.LLILLJJLI = c1323050kX9LIZJ;
            if (c1323050kX9LIZJ != null && c1323050kX9LIZJ.LJIILLIIL()) {
                Bitmap bitmap = c424700Gl2.LLILLJJLI.get();
                if (!bitmap.isRecycled()) {
                    c424700Gl2.getHierarchy().LJIJ(new C1319910kS5(new BitmapDrawable(bitmap), InterfaceC1320380kSq.LJI), 0);
                } else {
                    c424700Gl2.getHierarchy().LJIJ(null, 0);
                }
            }
        }
        C424700Gl2 c424700Gl22 = this.LLIZLLLIL;
        C1324840ka2.LJIIIIZZ(c424700Gl22, searchOperation.banner, c424700Gl22.getControllerListener());
        this.LLJ.setText(searchOperation.desc);
        this.LLJ.setTuxFont(52);
        this.LLJ.setMaxLines(2);
        if (TextUtils.isEmpty(this.LLJ.getText())) {
            C786410Ut5.LLLLLLZZ(this.LLJI, 4);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Pzu
            public final /* synthetic */ boolean LLILLL = false;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((IMainService) ServiceManager.get().getService(IMainService.class)).startAdsAppActivity(this.LL.getContext(), searchOperation.link, null);
                C650460PfI<C663250Pzv> c650460PfI = new C650460PfI<C663250Pzv>() { // from class: X.0Pzv
                };
                c650460PfI.LJIIZILJ("log_pb", this.LL.l3().LJIIJJI);
                c650460PfI.LJIIZILJ("card_id", searchOperation.cardId);
                c650460PfI.LJIJJ(this.LL.l3().LJIIIIZZ);
                c650460PfI.LJIIZILJ("search_keyword", this.LL.l3().LJFF);
                c650460PfI.LJIILJJIL();
                this.LL.R5("search_result_click");
                if (this.LLILLL) {
                    C663230Pzt c663230Pzt = this.LL;
                    c663230Pzt.getClass();
                    new C654720PmA<C654750PmD>(c663230Pzt.l3()) { // from class: X.0PmD
                        {
                            super("tns_click_see_support_resources", c653660PkS);
                            String str2 = c653660PkS.LJJIFFI;
                            LJ("use_scenario", str2 == null ? "else" : str2);
                            String str3 = c653660PkS.LJIIIIZZ;
                            LJ("search_type", str3 == null ? "general" : str3);
                            String str4 = c653660PkS.LJIIJ;
                            LJ("search_id", str4 == null ? "" : str4);
                            String str5 = c653660PkS.LJJI;
                            LJ("tns_ban_type", str5 != null ? str5 : "else");
                        }
                    }.LJIILJJIL();
                }
            }
        }, this.itemView);
    }

    public final void R5(String str) {
        C653660PkS c653660PkSL3 = l3();
        if (TextUtils.equals("search_result_click", str)) {
            C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkSL3);
            c654740PmCLIZ.LJIIZILJ("token_type", "activity");
            c654740PmCLIZ.LJIIZILJ("is_aladdin", "1");
            c654740PmCLIZ.LJIJI("search_result_id", this.LLJIJIL);
            c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_photo");
            c654740PmCLIZ.LJIILJJIL();
            return;
        }
        if (!TextUtils.equals("search_result_show", str)) {
            return;
        }
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkSL3);
        c654760PmELIZIZ.LJIIZILJ("token_type", "activity");
        c654760PmELIZIZ.LJIIZILJ("is_aladdin", "1");
        c654760PmELIZIZ.LJIJI("search_result_id", this.LLJIJIL);
        c654760PmELIZIZ.LJIILJJIL();
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        this.LLIZLLLIL.setAttached(true);
        this.LLIZLLLIL.setUserVisibleHint(true);
        R5("search_result_show");
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Animatable animatableLIZ;
        super.onViewDetachedFromWindow(view);
        this.LLIZLLLIL.setAttached(false);
        this.LLIZLLLIL.setUserVisibleHint(false);
        C424700Gl2 c424700Gl2 = this.LLIZLLLIL;
        if (c424700Gl2.getController() != null && (animatableLIZ = c424700Gl2.getController().LIZ()) != null && animatableLIZ.isRunning()) {
            animatableLIZ.stop();
        }
    }

    public C663230Pzt(View view, View view2) {
        super(view);
        this.LLIZ = view2;
        C424700Gl2 c424700Gl2 = (C424700Gl2) view.findViewById(R.id.pou);
        this.LLIZLLLIL = c424700Gl2;
        this.LLJ = (TuxTextView) view.findViewById(R.id.pot);
        this.LLJI = (TuxIconView) view.findViewById(R.id.okj);
        this.LLJIJIL = "";
        c424700Gl2.setOutlineProvider(new C689700R3o(1));
        c424700Gl2.setClipToOutline(true);
    }
}
