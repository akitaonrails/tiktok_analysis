package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20494815Hm implements C15IB {
    public final /* synthetic */ C20494715Hl LIZ;

    public C20494815Hm(C20494715Hl c20494715Hl) {
        this.LIZ = c20494715Hl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ(C20494915Hn c20494915Hn, View view, MusicModel musicModel) {
        String str;
        Activity activityLIZIZ;
        List<MusicModel> similarMusicList;
        if (c20494915Hn != null && view != null && musicModel != null) {
            int id = view.getId();
            Activity activityLIZ = null;
            if (id == R.id.nfx) {
                List<T> list = this.LIZ.mmItems;
                if (list == 0) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    if (((C20448614zs) ListProtector.get(list, i)).LIZIZ == musicModel) {
                        if (i >= 0 && (similarMusicList = musicModel.getSimilarMusicList()) != null && !similarMusicList.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < similarMusicList.size(); i2++) {
                                arrayList.add(new C20448614zs(0, (MusicModel) ListProtector.get(similarMusicList, i2), null, null));
                                ((MusicModel) ListProtector.get(similarMusicList, i2)).setSimilarMusic(true);
                            }
                            int size = similarMusicList.size();
                            if (musicModel.isUnfold()) {
                                int i3 = c20494915Hn.LLJILJILJ;
                                C20494715Hl c20494715Hl = this.LIZ;
                                int i4 = c20494715Hl.LLILZLL;
                                if (i4 > i3 && i4 <= i3 + size) {
                                    c20494715Hl.LLLIIIIL();
                                }
                                musicModel.setUnfold(false);
                                int i5 = i + 1;
                                list.removeAll(list.subList(i5, i5 + size));
                                this.LIZ.notifyItemRangeRemoved(i5, size);
                                this.LIZ.notifyItemChanged(i, MusicModel.SimilarMusicStatus.FOLD);
                                return;
                            }
                            musicModel.setUnfold(true);
                            ((MusicModel) ListProtector.get(similarMusicList, similarMusicList.size() - 1)).setLastSimilarMusic(true);
                            int i6 = i + 1;
                            list.addAll(i6, arrayList);
                            this.LIZ.notifyItemRangeInserted(i6, size);
                            this.LIZ.notifyItemChanged(i, MusicModel.SimilarMusicStatus.UNFOLD);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (id == R.id.lq6) {
                C15HO c15hoLLLFZ = this.LIZ.LLLFZ(musicModel);
                c15hoLLLFZ.LJIIIIZZ = musicModel.getLogPb();
                c15hoLLLFZ.LJIIIZ = musicModel.getSearchId();
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                    activityLIZ.getString(2131834437);
                }
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi(IAccountService.class);
                if (iAccountService != null && !iAccountService.LJIIJ().isLogin()) {
                    C629710Omv.LIZIZ(activityLIZ, C15J0.LIZLLL(1));
                    return;
                }
                MusicModel musicModel2 = c20494915Hn.LLJIJIL;
                if (musicModel2 != null) {
                    InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = c20494915Hn.LLJJ;
                    if (interfaceC20494515Hj != null) {
                        if (c20494915Hn.LL) {
                            str = "unfollow_type";
                        } else {
                            str = "follow_type";
                        }
                        interfaceC20494515Hj.LLIIL(new C15HP(str, c20494915Hn.LLJILJIL, c20494915Hn.LLJILJILJ, musicModel2));
                    }
                    c20494915Hn.LL = true ^ c20494915Hn.LL;
                    C15IS.LIZ(c20494915Hn.LLILZ, c20494915Hn.LLJJI);
                }
                C15IK.LJII(c20494915Hn.LL, musicModel, c15hoLLLFZ, c20494915Hn.LLJILJILJ, musicModel.getLogPb());
            }
        }
    }
}
