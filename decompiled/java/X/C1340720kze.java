package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0kze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340720kze extends FrameLayout {
    public final CommentTopBarStruct LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final Function2<View, CommentTopBarStruct, Boolean> LLILZ;
    public SmartImageView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;

    public C1340720kze(Context context, CommentTopBarStruct commentTopBarStruct, Aweme aweme, String str, C1342330l2F c1342330l2F) {
        super(context);
        this.LL = commentTopBarStruct;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = c1342330l2F;
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.a56, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a56, this, true);
        }
        this.LLILZIL = (SmartImageView) findViewById(R.id.a5q);
        this.LLILZLL = (TuxTextView) findViewById(R.id.jow);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.a6i);
        this.LLIZ = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.I7(new C1401860maG(this, tuxTextView, 0), tuxTextView);
            C1341780l1M.LIZIZ(C1341780l1M.LIZ, tuxTextView, EnumC1341650l19.BUTTON, 0.0f, null, 12);
            C632780Ors.LIZ(tuxTextView, C0HD5.LIZLLL(tuxTextView, 8), C0HD5.LIZLLL(tuxTextView, 8), C0HD5.LIZLLL(tuxTextView, 8), C0HD5.LIZLLL(tuxTextView, 8));
        }
        SmartImageView smartImageView = this.LLILZIL;
        if (smartImageView != null) {
            UrlModel urlModel = commentTopBarStruct.icon;
            if (urlModel == null) {
                C786410Ut5.LLFF(8, smartImageView);
            } else {
                C786410Ut5.LLFF(0, smartImageView);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                int iLIZLLL = C0HD5.LIZLLL(smartImageView, 20);
                int iLIZLLL2 = C0HD5.LIZLLL(smartImageView, 20);
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZLLL;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZLLL2;
                c1331670kl3LJIIIIZZ.LIZLLL("CommentHeaderView");
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(commentTopBarStruct.keyword);
        }
        TuxTextView tuxTextView3 = this.LLIZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(commentTopBarStruct.description);
        }
    }
}
