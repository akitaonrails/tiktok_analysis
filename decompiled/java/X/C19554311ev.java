package X;

import Y.ACListenerS163S0100000_29;
import Y.AfS198S0100000_29;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectListApi;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api.SoundEffectListApiResponse;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19554311ev implements InterfaceC19413110xF {
    public final C0E48 LIZ;
    public final View LIZIZ;
    public final SoundEffectTabModel LIZJ;
    public final int LIZLLL;
    public final C19554411ew LJ;
    public boolean LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final TextView LJIIIZ;
    public final C1749280vcc LJIIJ;
    public C11NJ LJFF = new C11NJ();
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(290));

    public final void LIZ() {
        View view = this.LJII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1749280vcc c1749280vcc = this.LJIIJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // X.InterfaceC19413110xF
    public final void LJJIFFI() {
        LIZIZ(this.LJ.LIZLLL);
    }

    public final void LIZIZ(final int i) {
        final boolean z;
        C19482711Kf c19482711KfLJIJJLI;
        if (this.LJ.LJ() || i == 0) {
            LIZ();
            C1749280vcc c1749280vcc = this.LJIIJ;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LJIIJ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LJ();
            }
        }
        final String str = this.LIZJ.id;
        if (str == null) {
            return;
        }
        final boolean zLJ = ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ();
        if (this.LIZJ.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        final C19552511ed c19552511ed = (C19552511ed) this.LJIIJJI.getValue();
        if (i == 0 && !z && c19552511ed.LIZIZ.containsKey(str)) {
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11eZ
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<SoundEffectListApiResponse> c09aj) {
                    C1C7U.LIZ("SoundEffectListApi$Companion@111a.getSoundEffectListFromCache$1");
                    C19552511ed c19552511ed2 = c19552511ed;
                    SoundEffectListApiResponse soundEffectListApiResponse = c19552511ed2.LIZIZ.get(str);
                    if (soundEffectListApiResponse != null) {
                        c09aj.onNext(soundEffectListApiResponse);
                        C1C7U.LIZIZ("SoundEffectListApi$Companion@111a.getSoundEffectListFromCache$1");
                    } else {
                        c09aj.tryOnError(new Exception("cache error"));
                        C1C7U.LIZIZ("SoundEffectListApi$Companion@111a.getSoundEffectListFromCache$1");
                    }
                }
            });
        } else {
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11ec
                public final /* synthetic */ int LIZLLL = 20;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<SoundEffectListApiResponse> c09aj) {
                    int i2;
                    boolean z2;
                    ArrayList<SoundEffect> arrayList;
                    int iIntValue;
                    boolean z3;
                    C1C7U.LIZ("SoundEffectListApi$Companion@111a.getSoundEffectList$1");
                    try {
                        if (!z) {
                            SoundEffectListApi.ApiSoundList apiSoundList = (SoundEffectListApi.ApiSoundList) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, SoundEffectListApi.ApiSoundList.class);
                            String str2 = str;
                            String strValueOf = String.valueOf(i);
                            String strValueOf2 = String.valueOf(this.LIZLLL);
                            C1493620oyG c1493620oyG = new C1493620oyG();
                            c1493620oyG.LIZLLL = 30000L;
                            c1493620oyG.LIZJ = 30000L;
                            c1493620oyG.LJ = 30000L;
                            SoundEffectListApiResponse soundEffectListApiResponse = apiSoundList.get(str2, strValueOf, strValueOf2, c1493620oyG).execute().LIZIZ;
                            ArrayList<SoundEffect> arrayList2 = soundEffectListApiResponse.list;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                Integer numValueOf = Integer.valueOf(i + soundEffectListApiResponse.list.size());
                                soundEffectListApiResponse.LL = numValueOf;
                                C19552511ed c19552511ed2 = c19552511ed;
                                String str3 = str;
                                ArrayList<SoundEffect> arrayList3 = soundEffectListApiResponse.list;
                                int iIntValue2 = numValueOf.intValue();
                                Integer num = soundEffectListApiResponse.hasMore;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                c19552511ed2.LIZ(arrayList3, iIntValue2, iIntValue, str3);
                                C19563211gM.LIZIZ(0, str, true);
                                ArrayList<SoundEffect> arrayList4 = soundEffectListApiResponse.list;
                                if (arrayList4 != null) {
                                    C19552511ed c19552511ed3 = c19552511ed;
                                    for (SoundEffect soundEffect : arrayList4) {
                                        String strLIZ = C356670Dyb.LIZ(soundEffect);
                                        if (soundEffect.collectStatus == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        c19552511ed3.LIZJ.put(strLIZ, Boolean.valueOf(z3));
                                    }
                                }
                                c09aj.onNext(soundEffectListApiResponse);
                            } else {
                                c09aj.tryOnError(new IllegalStateException("result list is null"));
                                C19563211gM.LIZIZ(soundEffectListApiResponse.status_code, str, false);
                            }
                        } else {
                            SoundEffectListApi.ApiCollectList apiCollectList = (SoundEffectListApi.ApiCollectList) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, SoundEffectListApi.ApiCollectList.class);
                            if (zLJ) {
                                i2 = 14;
                            } else {
                                i2 = 13;
                            }
                            String strValueOf3 = String.valueOf(i);
                            String strValueOf4 = String.valueOf(this.LIZLLL);
                            C1493620oyG c1493620oyG2 = new C1493620oyG();
                            c1493620oyG2.LIZLLL = 30000L;
                            c1493620oyG2.LIZJ = 30000L;
                            c1493620oyG2.LJ = 30000L;
                            SoundEffectListApiResponse soundEffectListApiResponse2 = apiCollectList.get(i2, strValueOf3, strValueOf4, c1493620oyG2).execute().LIZIZ;
                            if (soundEffectListApiResponse2.status_code == 0 && ((arrayList = soundEffectListApiResponse2.list) == null || arrayList.isEmpty())) {
                                c09aj.tryOnError(new IllegalStateException("error_msg_empty"));
                                C19563211gM.LIZIZ(0, str, true);
                            }
                            ArrayList<SoundEffect> arrayList5 = soundEffectListApiResponse2.list;
                            if (arrayList5 != null && !arrayList5.isEmpty()) {
                                soundEffectListApiResponse2.LL = Integer.valueOf(i + soundEffectListApiResponse2.list.size());
                                C19563211gM.LIZIZ(0, str, true);
                                ArrayList<SoundEffect> arrayList6 = soundEffectListApiResponse2.list;
                                if (arrayList6 != null) {
                                    C19552511ed c19552511ed4 = c19552511ed;
                                    for (SoundEffect soundEffect2 : arrayList6) {
                                        String strLIZ2 = C356670Dyb.LIZ(soundEffect2);
                                        if (soundEffect2.collectStatus == 1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c19552511ed4.LIZJ.put(strLIZ2, Boolean.valueOf(z2));
                                    }
                                }
                                c09aj.onNext(soundEffectListApiResponse2);
                            } else {
                                c09aj.tryOnError(new IllegalStateException("result list is null"));
                                C19563211gM.LIZIZ(soundEffectListApiResponse2.status_code, str, true);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C19563211gM.LIZIZ(-9999, str, false);
                        c09aj.tryOnError(e);
                    }
                    C1C7U.LIZIZ("SoundEffectListApi$Companion@111a.getSoundEffectList$1");
                }
            });
        }
        this.LJFF.LIZ(c19482711KfLJIJJLI.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.11ey
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                boolean z2;
                SoundEffectListApiResponse soundEffectListApiResponse = (SoundEffectListApiResponse) obj;
                C19555811fA c19555811fA = new Object() { // from class: X.11fA
                };
                ArrayList<SoundEffect> arrayList = soundEffectListApiResponse.list;
                c19555811fA.getClass();
                if (arrayList != null) {
                    for (SoundEffect soundEffect : arrayList) {
                        String strLJI = C1403010mc7.LIZ.getMusicService().LJI(C19556611fI.LIZ(soundEffect));
                        soundEffect.fileLocalPath = strLJI;
                        if (C123100dR.LIZ(strLJI) && C2486109oh.LIZ(soundEffect.fileLocalPath) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        soundEffect.isLocalFileExist = z2;
                    }
                }
                return soundEffectListApiResponse;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 13), new AfS198S0100000_29(this, 14)));
    }

    public C19554311ev(C19EG c19eg, C0E48 c0e48, View view, InterfaceC19556411fG interfaceC19556411fG, SoundEffectTabModel soundEffectTabModel, int i) {
        C19554411ew c19554411ew;
        View viewFindViewById;
        this.LIZ = c0e48;
        this.LIZIZ = view;
        this.LIZJ = soundEffectTabModel;
        this.LIZLLL = i;
        int iLIZIZ = (int) (C373030Ejt.LIZIZ(c19eg) / C19554811f0.LIZ);
        C19556111fD c19556111fD = new C19556111fD(interfaceC19556411fG, this, i);
        if (iLIZIZ > 0 && i <= 2 && 1 != soundEffectTabModel.LIZ) {
            iLIZIZ = i > 1 ? 0 : iLIZIZ;
            View viewFindViewById2 = view.findViewById(R.id.ic8);
            if (viewFindViewById2 != null) {
                C373030Ejt.LIZJ(viewFindViewById2);
            }
            c19554411ew = new C19554511ex(c19556111fD, iLIZIZ);
        } else {
            if (soundEffectTabModel.LIZ == 1 && (viewFindViewById = view.findViewById(R.id.ic8)) != null) {
                C373030Ejt.LIZJ(viewFindViewById);
            }
            c19554411ew = new C19554411ew(c19556111fD);
        }
        this.LJ = c19554411ew;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tv6);
        View viewFindViewById3 = view.findViewById(R.id.tf5);
        this.LJII = viewFindViewById3;
        this.LJIIIIZZ = view.findViewById(R.id.tep);
        this.LJIIIZ = (TextView) view.findViewById(R.id.tf0);
        this.LJIIJ = (C1749280vcc) view.findViewById(R.id.vqg);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(c19eg, 1);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            recyclerView.setItemAnimator(null);
        }
        c19554411ew.LIZIZ(recyclerView);
        if (soundEffectTabModel.id != null) {
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 154), viewFindViewById3);
            }
            LIZIZ(c19554411ew.LIZLLL);
        }
    }
}
