package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19405210vy implements InterfaceC19405710w3 {
    public final ViewPager LIZ;
    public final C19Y3 LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final Context LJ;
    public Challenge LJFF;
    public NewFaceStickerBean LJI;
    public final ChallengeDetailFragment LJII;

    @Override // X.InterfaceC19405710w3
    public final void LIZIZ() {
        this.LIZIZ.LLJJJJJIL.clear();
    }

    public final C1258150iqT<AmeBaseFragment> LJFF() {
        return (C1258150iqT) this.LIZ.getAdapter();
    }

    @Override // X.InterfaceC19405710w3
    public final void LIZ(int i) {
        Fragment fragmentLJJIJIL = LJFF().LJJIJIL(this.LIZ.getCurrentItem());
        if ((fragmentLJJIJIL instanceof CommerceChallengeFragment) && i != 0) {
            ((CommerceChallengeFragment) fragmentLJJIJIL).OR();
        }
    }

    @Override // X.InterfaceC19405710w3
    public final void LIZJ(float f) {
        Fragment fragmentLJJIJIL = LJFF().LJJIJIL(this.LIZ.getCurrentItem());
        if ((fragmentLJJIJIL instanceof CommerceChallengeFragment) && f != 0.0f) {
            ((CommerceChallengeFragment) fragmentLJJIJIL).OR();
        }
    }

    @Override // X.InterfaceC19405710w3
    public final boolean LJ(int i) {
        if (i == R.id.vz7) {
            ICommerceLockStickerService iCommerceLockStickerServiceLIZJ = CommerceLockStickerServiceImpl.LIZJ();
            NewFaceStickerBean newFaceStickerBean = this.LJI;
            if (newFaceStickerBean != null && iCommerceLockStickerServiceLIZJ.LIZ(newFaceStickerBean)) {
                iCommerceLockStickerServiceLIZJ.LIZIZ(this.LJ, this.LJI, "challenge");
                return true;
            }
            return false;
        }
        return false;
    }

    public C19405210vy(View view, Fragment fragment) {
        this.LIZ = (ViewPager) view.findViewById(R.id.viewpager);
        this.LIZIZ = (C19Y3) view.findViewById(R.id.wya);
        this.LIZJ = view.findViewById(R.id.p3u);
        this.LIZLLL = (ImageView) view.findViewById(R.id.vzc);
        this.LJ = view.getContext();
        this.LJII = (ChallengeDetailFragment) fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC19405710w3
    public final void LIZLLL(ChallengeDetail challengeDetail, int i) {
        List<ShowItemsStruct> list;
        List<ShowItemsStruct> list2;
        String cid;
        ImageView imageView;
        String challengeStickerDetail;
        this.LJFF = challengeDetail.challenge;
        try {
            Gson gson = new Gson();
            Challenge challenge = this.LJFF;
            if (challenge != null) {
                challengeStickerDetail = challenge.getChallengeStickerDetail();
            } else {
                challengeStickerDetail = null;
            }
            this.LJI = (NewFaceStickerBean) gson.LJIIIIZZ(challengeStickerDetail, new TypeToken<NewFaceStickerBean>() { // from class: X.10w0
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LJI != null && CommerceLockStickerServiceImpl.LIZJ().LIZ(this.LJI) && (imageView = this.LIZLLL) != null) {
            imageView.setImageResource(R.drawable.d_3);
        }
        Challenge challenge2 = this.LJFF;
        if (challenge2 != null) {
            list = challenge2.showItems;
        } else {
            list = null;
        }
        if (C086I.LIZIZ(list)) {
            C786410Ut5.LLLLIL(this.LIZIZ, 8);
            return;
        }
        ((C117L) this.LIZ).setPagingEnable(true);
        this.LIZ.setOffscreenPageLimit(2);
        C786410Ut5.LLLLIL(this.LIZIZ, 0);
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = this.LIZ.getCurrentItem();
        Object obj = ListProtector.get(this.LJII.WR(), 0);
        Object obj2 = ListProtector.get(LJFF().LLIZLLLIL, 0);
        AmeBaseFragment ameBaseFragment = (AmeBaseFragment) ListProtector.get(LJFF().LLIZ, 0);
        ameBaseFragment.isCommerce = true;
        List<InterfaceC19400810vG> listWR = this.LJII.WR();
        listWR.clear();
        listWR.add(obj);
        List<T> list3 = LJFF().LLIZ;
        list3.clear();
        list3.add((T) ameBaseFragment);
        List<Integer> list4 = LJFF().LLIZLLLIL;
        list4.clear();
        list4.add((Integer) obj2);
        Challenge challenge3 = this.LJFF;
        if (challenge3 != null && (list2 = challenge3.showItems) != null) {
            for (ShowItemsStruct showItemsStruct : list2) {
                CommerceChallengeFragment commerceChallengeFragment = new CommerceChallengeFragment();
                commerceChallengeFragment.LLILZIL = showItemsStruct.desc;
                commerceChallengeFragment.LLIZ = showItemsStruct.schema;
                Challenge challenge4 = this.LJFF;
                if (challenge4 != null) {
                    cid = challenge4.getCid();
                } else {
                    cid = null;
                }
                commerceChallengeFragment.LLILZ = cid;
                this.LJII.WR().add(commerceChallengeFragment);
                LJFF().LLIZ.add(commerceChallengeFragment);
                LJFF().LLIZLLLIL.add(Integer.valueOf(commerceChallengeFragment.hashCode()));
            }
        }
        Iterator<InterfaceC19400810vG> it2 = this.LJII.WR().iterator();
        while (it2.hasNext()) {
            it2.next().Jo(true);
        }
        LJFF().notifyDataSetChanged();
        if (i >= 0 && i < LJFF().LLIZ.size()) {
            c118300cf.element = i;
        }
        this.LIZIZ.setupWithViewPager(this.LIZ);
        this.LIZIZ.setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.10vH
            @Override // X.InterfaceC1245470iW1
            public final void LIZ(C19Y5 c19y5) {
                this.LIZ.LJII.onTextClick(c19y5.LJ);
                c19y5.LIZ();
            }
        });
        this.LIZIZ.LIZIZ(new InterfaceC20516715Px() { // from class: X.10vz
            @Override // X.InterfaceC20516715Px
            public final void LIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZIZ(C19Y5 c19y5) {
            }

            @Override // X.InterfaceC20516715Px
            public final void LIZJ(C19Y5 c19y5) {
                String str;
                List<ShowItemsStruct> list5;
                ShowItemsStruct showItemsStruct2;
                if (c19y5 != null) {
                    int i2 = c19y5.LJ;
                    C19405210vy c19405210vy = this.LIZ;
                    String cid2 = null;
                    if (i2 == 0) {
                        str = "output";
                    } else {
                        Challenge challenge5 = c19405210vy.LJFF;
                        if (challenge5 != null && (list5 = challenge5.showItems) != null && (showItemsStruct2 = (ShowItemsStruct) ListProtector.get(list5, i2 - 1)) != null) {
                            str = showItemsStruct2.type;
                        } else {
                            str = null;
                        }
                    }
                    c19405210vy.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    Challenge challenge6 = c19405210vy.LJFF;
                    if (challenge6 != null) {
                        cid2 = challenge6.getCid();
                    }
                    c2344009Gk.LJIIIIZZ("tag_id", cid2);
                    c2344009Gk.LJIIIIZZ("tag_name", str);
                    C20684815ws.LJIILLIIL("change_inter_tag", c2344009Gk.LIZ);
                }
            }
        });
        this.LIZ.setCurrentItem(c118300cf.element);
        this.LIZ.addOnPageChangeListener(new C360660ECa(c118300cf, this) { // from class: X.0da1
            public int LL;
            public final /* synthetic */ C19405210vy LLILLJJLI;

            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i2) throws JSONException {
                C1037220d68 c1037220d68NR;
                Fragment fragmentLJJIJIL = this.LLILLJJLI.LJFF().LJJIJIL(i2);
                if ((fragmentLJJIJIL instanceof CommerceChallengeFragment) && fragmentLJJIJIL != null) {
                    C786410Ut5.LJLIIL(100L, new BPEAHandler(), new ARunnableS116S0100000_16((CommerceChallengeFragment) fragmentLJJIJIL, 217));
                }
                Fragment fragmentLJJIJIL2 = this.LLILLJJLI.LJFF().LJJIJIL(this.LL);
                if ((fragmentLJJIJIL2 instanceof CommerceChallengeFragment) && fragmentLJJIJIL2 != null && (c1037220d68NR = ((CommerceChallengeFragment) fragmentLJJIJIL2).NR()) != null) {
                    c1037220d68NR.LIZIZ("brand_room_left", new JSONObject());
                }
                this.LL = i2;
            }

            {
                this.LLILLJJLI = this;
                this.LL = c118300cf.element;
            }
        });
        this.LJII.onPageSelected(c118300cf.element);
    }
}
