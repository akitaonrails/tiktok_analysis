package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import wh6.AbS688S0100000_6;

/* JADX INFO: renamed from: X.0GuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430420GuG implements IExternalHeaderProvider {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZJ;

    @Override // com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider
    public final int getViewType() {
        return 10001;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider
    public final boolean isFullSpan() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider
    public final boolean shouldShow() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof C430410GuF)) {
            return;
        }
        final C430410GuF c430410GuF = (C430410GuF) viewHolder;
        final Function0<Unit> function0 = this.LIZ;
        Function0<Unit> function02 = this.LIZIZ;
        TuxIconView tuxIconView = c430410GuF.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AbS688S0100000_6(function02, 7), tuxIconView);
        }
        final Context context = c430410GuF.itemView.getContext();
        final TuxTextView tuxTextView = c430410GuF.LL;
        if (tuxTextView != null) {
            final String string = context.getString(2131846212);
            final String string2 = context.getString(2131846210, string);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            int width = (tuxTextView.getWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd();
            if (width > 0) {
                C430410GuF.I5(tuxTextView, context, string2, string, width, function0);
            } else {
                tuxTextView.setText(C430410GuF.L5(context, string2, string, function0));
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new Runnable() { // from class: X.0Gba
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("InvalidVideosBannerHeaderProvider$InvalidBannerViewHolder@211b.bind$$inlined$doOnPreDraw$1");
                        try {
                            int width2 = (tuxTextView.getWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd();
                            if (width2 > 0) {
                                C430410GuF c430410GuF2 = c430410GuF;
                                TuxTextView tuxTextView2 = tuxTextView;
                                Context context2 = context;
                                String str = string2;
                                String str2 = string;
                                Function0 function03 = function0;
                                c430410GuF2.getClass();
                                C430410GuF.I5(tuxTextView2, context2, str, str2, width2, function03);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("InvalidVideosBannerHeaderProvider$InvalidBannerViewHolder@211b.bind$$inlined$doOnPreDraw$1");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new C430410GuF(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6h, viewGroup, false));
    }

    public C430420GuG(AwS563S0100000_19 awS563S0100000_19, AwS563S0100000_19 awS563S0100000_192) {
        this.LIZ = awS563S0100000_19;
        this.LIZIZ = awS563S0100000_192;
    }
}
