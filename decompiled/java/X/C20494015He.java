package X;

import Y.ARunnableS100S0200000_31;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: renamed from: X.15He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20494015He implements C15HQ {
    public final /* synthetic */ C20494715Hl LIZ;

    public C20494015He(C20494715Hl c20494715Hl) {
        this.LIZ = c20494715Hl;
    }

    @Override // X.C15HQ
    public final void LIZ(C15IP c15ip, View view, MusicModel musicModel, int i) {
        String str;
        if (musicModel != null && view != null && view.getContext() != null) {
            if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                C682480Qpq.LIZ().LJI(new MusicSearchHistory(musicModel.getSearchKeyWords()));
            }
            view.getContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                if (!musicModel.isLocalMusic()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(view.getContext());
                    c1233040iBy.LIZIZ(2131837962);
                    c1233040iBy.LIZLLL();
                    return;
                }
            }
            int id = view.getId();
            C15HO c15hoLLLFZ = this.LIZ.LLLFZ(musicModel);
            c15hoLLLFZ.LJIIIIZZ = musicModel.getLogPb();
            c15hoLLLFZ.LJIIIZ = musicModel.getSearchId();
            if (id == R.id.lox) {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    activityLJFF.getString(2131834437);
                }
                if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                    C629710Omv.LIZIZ(C2214201BlK.LJFF(), C15J0.LIZLLL(i));
                    return;
                } else {
                    c15ip.L5();
                    C15IK.LJII(c15ip.LLJJLIIIJLLLLLLLZ, musicModel, c15hoLLLFZ, c15ip.LLJLLIL, musicModel.getLogPb());
                    return;
                }
            }
            if (id == R.id.lp1) {
                if (musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                    String offlineDesc = musicModel.getMusic().getOfflineDesc();
                    if (TextUtils.isEmpty(offlineDesc)) {
                        offlineDesc = view.getContext().getString(2131837770);
                    }
                    C1233040iBy c1233040iBy2 = new C1233040iBy(view.getContext());
                    c1233040iBy2.LIZJ(offlineDesc);
                    c1233040iBy2.LIZLLL();
                    return;
                }
                if (!C142I.LIZ(musicModel, view.getContext(), true)) {
                    return;
                }
                String string = UUID.randomUUID().toString();
                C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://music/detail/");
                sbLIZ.append(musicModel.getMusicId());
                C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                c686150Qvl.LIZIZ("process_id", string);
                c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
                C15IK.LJIIIIZZ(c15hoLLLFZ, musicModel.getMusicId(), false, string);
                return;
            }
            if (id != R.id.njf && id != R.id.tpu) {
                if (id == R.id.nfe) {
                    this.LIZ.LLLI(c15ip, musicModel);
                    if (this.LIZ.LLJILLL && musicModel.getSmartExtendMusicList() != null && !musicModel.getSmartExtendMusicList().isEmpty()) {
                        C15IK.LJIILLIIL(musicModel, c15hoLLLFZ, musicModel.isSmartExtended(), "smart_extend_show");
                        return;
                    }
                    return;
                }
                if (id == R.id.vma) {
                    musicModel.setSmartExtended(!musicModel.isSmartExtended());
                    C15IK.LJIILLIIL(musicModel, c15hoLLLFZ, musicModel.isSmartExtended(), "smart_extend_click");
                    C15IK.LJIILLIIL(musicModel, c15hoLLLFZ, musicModel.isSmartExtended(), "smart_extend_show");
                    this.LIZ.notifyItemChanged(c15ip.getBindingAdapterPosition());
                    C15H0 c15h0 = this.LIZ.LLILLJJLI;
                    if (c15h0 != null) {
                        c15h0.Dl0(new C15IZ() { // from class: X.15Hh
                            @Override // X.C15IZ
                            public final void LIZ() {
                                this.LIZ.LIZ.LLLII(false);
                            }
                        });
                        this.LIZ.LLILLJJLI.cJ(musicModel, c15hoLLLFZ);
                        C15IK.LIZLLL = c15ip.getPosition();
                        return;
                    }
                    return;
                }
                if (id == R.id.loz) {
                    C20494715Hl c20494715Hl = this.LIZ;
                    c20494715Hl.LLJILLL = !c20494715Hl.LLJILLL;
                    c15ip.a6(false, false, false);
                    c20494715Hl.LLLIIIIL();
                    C15HO c15hoLLLFZ2 = c20494715Hl.LLLFZ(musicModel);
                    Fragment fragment = c20494715Hl.LL;
                    if (fragment != null && fragment.getActivity() != null && c15hoLLLFZ2 != null) {
                        c15hoLLLFZ2.LJIIJ = C15IK.LIZIZ(c15hoLLLFZ2.LIZLLL);
                        c20494715Hl.LLIZLLLIL.LIZJ = "change_music";
                        ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C1659630tI1.LJ(c20494715Hl.LL).get(ChooseMusicCutViewModel.class);
                        chooseMusicCutViewModel.wQ2().postValue(musicModel);
                        chooseMusicCutViewModel.vQ2().postValue(c15hoLLLFZ2);
                        return;
                    }
                    return;
                }
                if (id == R.id.lnu) {
                    InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LIZ.LLILLL;
                    if (interfaceC20494515Hj != null) {
                        interfaceC20494515Hj.LLIIL(new C15HP("local_music_delete_click", -1, c15ip.LLJLLIL, musicModel));
                        return;
                    }
                    return;
                }
                if (id == R.id.fsg) {
                    C20494715Hl c20494715Hl2 = this.LIZ;
                    if (c20494715Hl2.LLILLL != null) {
                        c20494715Hl2.LLLIIIIL();
                        boolean zIsChecked = ((CompoundButton) view).isChecked();
                        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj2 = this.LIZ.LLILLL;
                        if (zIsChecked) {
                            str = "local_music_import_select";
                        } else {
                            str = "local_music_import_unselect";
                        }
                        interfaceC20494515Hj2.LLIIL(new C15HP(str, -1, -1, musicModel));
                        int position = c15ip.getPosition();
                        if (position >= 0) {
                            if (zIsChecked) {
                                ((HashSet) this.LIZ.LLJJJIL).add(Integer.valueOf(position));
                                return;
                            } else {
                                ((HashSet) this.LIZ.LLJJJIL).remove(Integer.valueOf(position));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (musicModel.isLocalMusic()) {
                C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(musicModel, new C20494215Hg(this, view, musicModel, c15ip), 45));
            } else {
                if (!C142I.LIZ(musicModel, view.getContext(), true)) {
                    return;
                }
                this.LIZ.LLLIILIL(c15ip, musicModel);
            }
        }
    }
}
