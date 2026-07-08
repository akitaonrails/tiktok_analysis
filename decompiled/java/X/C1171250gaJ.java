package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171250gaJ extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final SmartImageView LLILZ;
    public final SmartImageView LLILZIL;
    public final SmartImageView LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final TuxIconView LLJ;
    public CollectionContentResponse LLJI;
    public C11JF LLJIJIL;
    public CollectionDetail LLJILJIL;
    public final /* synthetic */ CollectionListMainUIAssem LLJILJILJ;

    public final void I5(List<? extends Aweme> list) {
        int i;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Aweme> it2 = list.iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Aweme next = it2.next();
                Aweme aweme = next;
                if (!AwemeExtKt.isDelete(aweme) && aweme.isCanPlay()) {
                    arrayList.add(next);
                }
            }
            List listLL = C13LP.LL(arrayList, 4);
            if (listLL != null) {
                for (Object obj : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Aweme aweme2 = (Aweme) obj;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        new C1170800gZa(this, this.LLILZLL, aweme2).LIZ();
                                    }
                                } else {
                                    new C1170800gZa(this, this.LLILZIL, aweme2).LIZ();
                                }
                            } else {
                                new C1170800gZa(this, this.LLILZ, aweme2).LIZ();
                            }
                        } else {
                            new C1170800gZa(this, this.LLILLL, aweme2).LIZ();
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171250gaJ(CollectionListMainUIAssem collectionListMainUIAssem, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6k, viewGroup, false));
        this.LLJILJILJ = collectionListMainUIAssem;
        this.LL = (TextView) this.itemView.findViewById(R.id.p09);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.videos);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.video_cover_1);
        this.LLILLL = smartImageView;
        SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.video_cover_2);
        this.LLILZ = smartImageView2;
        SmartImageView smartImageView3 = (SmartImageView) this.itemView.findViewById(R.id.video_cover_3);
        this.LLILZIL = smartImageView3;
        SmartImageView smartImageView4 = (SmartImageView) this.itemView.findViewById(R.id.video_cover_4);
        this.LLILZLL = smartImageView4;
        this.LLIZ = this.itemView.findViewById(R.id.noy);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.videos_dot);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.e5t);
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        C1378990lzN.LIZIZ(smartImageView2, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        C1378990lzN.LIZIZ(smartImageView3, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        C1378990lzN.LIZIZ(smartImageView4, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
    }
}
