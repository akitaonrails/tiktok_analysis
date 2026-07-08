package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11e6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19549211e6 {
    public Context LIZ;
    public String LIZIZ;
    public List<MemeSongModel> LIZJ;
    public Long LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public C19529711ax LJII;
    public final C01GW LJIIIIZZ;
    public List<MemeSongModel> LJIIIZ;
    public MemeSongModel LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public final MutableLiveData<Boolean> LJIILIIL;
    public final MutableLiveData<Boolean> LJIILJJIL;
    public final MutableLiveData<Boolean> LJIILL;
    public final MutableLiveData<Boolean> LJIILLIIL;
    public final MutableLiveData<Boolean> LJIIZILJ;
    public final MutableLiveData<Boolean> LJIJ;
    public final MutableLiveData<Boolean> LJIJI;
    public final MutableLiveData<Boolean> LJIJJ;
    public final MutableLiveData<Boolean> LJIJJLI;
    public final MutableLiveData<Boolean> LJIL;
    public final MutableLiveData<Boolean> LJJ;
    public final MutableLiveData<Boolean> LJJI;
    public final MutableLiveData<Boolean> LJJIFFI;
    public final MutableLiveData<Boolean> LJJII;
    public final MutableLiveData<String> LJJIII;
    public final MutableLiveData<Integer> LJJIIJ;
    public final MutableLiveData<String> LJJIIJZLJL;
    public final MutableLiveData<Boolean> LJJIIZ;
    public final MutableLiveData<Integer> LJJIIZI;
    public final MutableLiveData<List<Pair<String, Boolean>>> LJJIJ;
    public InterfaceC19549711eB LJJIJIIJI;

    public final void LIZJ() {
        this.LJIIL = -1;
        this.LJIILJJIL.setValue(Boolean.FALSE);
        InterfaceC19549711eB interfaceC19549711eB = this.LJJIJIIJI;
        if (interfaceC19549711eB != null) {
            interfaceC19549711eB.LJIIJJI(this.LJIIJJI);
        }
        InterfaceC19549811eC interfaceC19549811eCLIZLLL = LIZLLL();
        if (interfaceC19549811eCLIZLLL != null) {
            interfaceC19549811eCLIZLLL.release();
        }
        C19529711ax c19529711ax = this.LJII;
        if (c19529711ax != null) {
            c19529711ax.LIZLLL();
        }
    }

    public final InterfaceC19549811eC LIZLLL() {
        return (InterfaceC19549811eC) this.LJFF.getValue();
    }

    public C19549211e6() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZJ = c13bv;
        this.LJFF = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(1));
        this.LJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(3));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(2));
        this.LJIIIZ = new ArrayList();
        this.LJIIL = -1;
        this.LJIILIIL = new MutableLiveData<>();
        this.LJIILJJIL = new MutableLiveData<>();
        this.LJIILL = new MutableLiveData<>();
        this.LJIILLIIL = new MutableLiveData<>();
        this.LJIIZILJ = new MutableLiveData<>();
        this.LJIJ = new MutableLiveData<>();
        this.LJIJI = new MutableLiveData<>();
        this.LJIJJ = new MutableLiveData<>();
        this.LJIJJLI = new MutableLiveData<>();
        this.LJIL = new MutableLiveData<>();
        this.LJJ = new MutableLiveData<>();
        this.LJJI = new MutableLiveData<>();
        this.LJJIFFI = new MutableLiveData<>();
        this.LJJII = new MutableLiveData<>();
        this.LJJIII = new MutableLiveData<>(null);
        this.LJJIIJ = new MutableLiveData<>();
        this.LJJIIJZLJL = new MutableLiveData<>(C194397113r.LIZ(null));
        this.LJJIIZ = new MutableLiveData<>();
        this.LJJIIZI = new MutableLiveData<>(0);
        this.LJJIJ = new MutableLiveData<>(c13bv);
    }

    public final void LIZ(int i) {
        String str;
        if (this.LJIIL == i) {
            return;
        }
        this.LJIIL = i;
        this.LJIIJ = null;
        if (i != 0) {
            if (i != 40) {
                if (i != 10) {
                    if (i != 11) {
                        if (i != 20) {
                            if (i == 21) {
                                MutableLiveData<Boolean> mutableLiveData = this.LJIILIIL;
                                Boolean bool = Boolean.FALSE;
                                mutableLiveData.setValue(bool);
                                this.LJIILL.setValue(bool);
                                this.LJIILJJIL.postValue(bool);
                                this.LJIIZILJ.setValue(bool);
                                this.LJIJ.setValue(bool);
                                this.LJIJI.setValue(bool);
                                this.LJIJJLI.setValue(bool);
                                this.LJIL.setValue(Boolean.TRUE);
                                this.LJJ.setValue(bool);
                                this.LJJI.setValue(bool);
                                this.LJIJJ.setValue(bool);
                                return;
                            }
                            return;
                        }
                        MutableLiveData<Boolean> mutableLiveData2 = this.LJIILIIL;
                        Boolean bool2 = Boolean.FALSE;
                        mutableLiveData2.setValue(bool2);
                        this.LJIILL.setValue(bool2);
                        this.LJIILJJIL.postValue(bool2);
                        this.LJIIZILJ.setValue(bool2);
                        this.LJIJ.setValue(bool2);
                        this.LJIJI.setValue(bool2);
                        this.LJIJJLI.setValue(Boolean.TRUE);
                        this.LJIL.setValue(bool2);
                        this.LJJ.setValue(bool2);
                        this.LJJI.setValue(bool2);
                        this.LJIJJ.setValue(bool2);
                        Context context = this.LIZ;
                        if (context != null && (str = this.LJIIJJI) != null) {
                            C1211030hcT c1211030hcT = new C1211030hcT();
                            c1211030hcT.LIZ(1, 60, 10000L, new AwS608S0100000_29(this, 0));
                            C19529711ax c19529711ax = this.LJII;
                            if (c19529711ax != null) {
                                c19529711ax.LIZLLL();
                            }
                            C19529711ax c19529711ax2 = new C19529711ax(context);
                            C19529911az c19529911az = new C19529911az("base");
                            c19529911az.LJJIFFI(str, "prompt");
                            c19529911az.LJJIFFI(this.LJIIIIZZ.getValue(), "base_path");
                            c19529711ax2.LJII(c19529911az);
                            c19529711ax2.LJFF.LIZ = new C19532411bO(c1211030hcT, this, context);
                            this.LJII = c19529711ax2;
                            ((AbstractC19524211a4) this.LJI.getValue()).LJJIJIL(c19529711ax2, null);
                        }
                        InterfaceC19549711eB interfaceC19549711eB = this.LJJIJIIJI;
                        if (interfaceC19549711eB == null) {
                            return;
                        }
                        interfaceC19549711eB.onLoading();
                        return;
                    }
                    LIZIZ(false);
                    return;
                }
                LIZIZ(true);
                return;
            }
            MutableLiveData<Boolean> mutableLiveData3 = this.LJIILIIL;
            Boolean bool3 = Boolean.TRUE;
            mutableLiveData3.setValue(bool3);
            MutableLiveData<Boolean> mutableLiveData4 = this.LJIILL;
            Boolean bool4 = Boolean.FALSE;
            mutableLiveData4.setValue(bool4);
            this.LJIILJJIL.postValue(bool4);
            this.LJIIZILJ.setValue(bool4);
            this.LJIJ.setValue(bool4);
            this.LJIJI.setValue(bool3);
            this.LJIJJLI.setValue(bool4);
            this.LJIL.setValue(bool4);
            this.LJJ.setValue(bool3);
            this.LJJI.setValue(bool3);
            this.LJJIFFI.setValue(Boolean.valueOf(!Intrinsics.LJFF(this.LIZIZ, "EditMusicPanel")));
            this.LJIJJ.setValue(bool3);
            this.LJJIIZ.setValue(bool4);
            ArrayList arrayList = new ArrayList();
            for (MemeSongModel memeSongModel : (ArrayList) this.LJIIIZ) {
                arrayList.add(new Pair(memeSongModel.getStyle(), Boolean.valueOf(memeSongModel.isSelected())));
            }
            this.LJJIJ.postValue(arrayList);
            String str2 = this.LIZIZ;
            if (Intrinsics.LJFF(str2, "EditMusicPanel")) {
                this.LJJII.setValue(Boolean.FALSE);
            } else if (Intrinsics.LJFF(str2, "MusicDetail")) {
                this.LJJII.setValue(Boolean.TRUE);
            } else {
                this.LJJII.setValue(Boolean.valueOf(!(!this.LIZJ.isEmpty())));
            }
            long jLongValue = 0;
            if (!this.LIZJ.isEmpty()) {
                InterfaceC19549711eB interfaceC19549711eB2 = this.LJJIJIIJI;
                if (interfaceC19549711eB2 == null) {
                    return;
                }
                interfaceC19549711eB2.LLIILZL(0L);
                return;
            }
            InterfaceC19549711eB interfaceC19549711eB3 = this.LJJIJIIJI;
            if (interfaceC19549711eB3 == null) {
                return;
            }
            Long l = this.LIZLLL;
            if (l != null) {
                jLongValue = l.longValue();
            }
            interfaceC19549711eB3.LLIILZL(jLongValue);
            return;
        }
        this.LJJIIJZLJL.setValue(C194397113r.LIZ(null));
        MutableLiveData<Boolean> mutableLiveData5 = this.LJIILIIL;
        Boolean bool5 = Boolean.TRUE;
        mutableLiveData5.setValue(bool5);
        this.LJIILLIIL.setValue(bool5);
        this.LJIILL.setValue(bool5);
        this.LJIILJJIL.postValue(bool5);
        this.LJIIZILJ.setValue(bool5);
        MutableLiveData<Boolean> mutableLiveData6 = this.LJIJ;
        Boolean bool6 = Boolean.FALSE;
        mutableLiveData6.setValue(bool6);
        this.LJIJI.setValue(bool6);
        this.LJIJJLI.setValue(bool6);
        this.LJIL.setValue(bool6);
        this.LJJ.setValue(bool6);
        this.LJJI.setValue(bool6);
        this.LJIJJ.setValue(bool5);
        this.LJJIIZ.setValue(bool5);
        InterfaceC19549811eC interfaceC19549811eCLIZLLL = LIZLLL();
        if (interfaceC19549811eCLIZLLL == null) {
            return;
        }
        interfaceC19549811eCLIZLLL.stop();
    }

    public final void LIZIZ(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJIILIIL;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        this.LJIILL.setValue(bool);
        this.LJIILJJIL.setValue(Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData2 = this.LJIILLIIL;
        Boolean bool2 = Boolean.FALSE;
        mutableLiveData2.setValue(bool2);
        this.LJIIZILJ.setValue(bool);
        this.LJIJ.setValue(bool);
        this.LJIJI.setValue(bool2);
        this.LJIJJLI.setValue(bool2);
        this.LJIL.setValue(bool2);
        this.LJJ.setValue(bool2);
        this.LJJI.setValue(bool2);
        this.LJIJJ.setValue(bool);
        this.LJJIIZ.setValue(bool);
    }

    public final void LJ(boolean z) {
        this.LJ = true;
        if (z) {
            if (!this.LIZJ.isEmpty()) {
                InterfaceC19549711eB interfaceC19549711eB = this.LJJIJIIJI;
                if (interfaceC19549711eB != null) {
                    interfaceC19549711eB.LJJLIIIJL();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.LIZJ);
                this.LJIIIZ = arrayList;
                LIZ(40);
                return;
            }
            InterfaceC19549711eB interfaceC19549711eB2 = this.LJJIJIIJI;
            if (interfaceC19549711eB2 != null) {
                interfaceC19549711eB2.LJJLIIIJL();
            }
            LIZ(0);
            InterfaceC19549711eB interfaceC19549711eB3 = this.LJJIJIIJI;
            if (interfaceC19549711eB3 == null) {
                return;
            }
            interfaceC19549711eB3.LLIZ();
            return;
        }
        if (this.LJIIL != 40) {
            return;
        }
        InterfaceC19549811eC interfaceC19549811eCLIZLLL = LIZLLL();
        if (interfaceC19549811eCLIZLLL != null && interfaceC19549811eCLIZLLL.LJII()) {
            MemeSongModel memeSongModel = this.LJIIJ;
            if (memeSongModel == null) {
                return;
            }
            LJFF(memeSongModel);
            return;
        }
        InterfaceC19549811eC interfaceC19549811eCLIZLLL2 = LIZLLL();
        if (interfaceC19549811eCLIZLLL2 == null) {
            return;
        }
        interfaceC19549811eCLIZLLL2.LJIILLIIL();
    }

    public final void LJFF(MemeSongModel memeSongModel) {
        String localSongPath = memeSongModel.getLocalSongPath();
        if (localSongPath == null) {
            return;
        }
        InterfaceC19549811eC interfaceC19549811eCLIZLLL = LIZLLL();
        if (interfaceC19549811eCLIZLLL != null) {
            interfaceC19549811eCLIZLLL.LIZIZ(new C19550211eG(Collections.singletonList(localSongPath)));
        }
        InterfaceC19549811eC interfaceC19549811eCLIZLLL2 = LIZLLL();
        if (interfaceC19549811eCLIZLLL2 != null) {
            interfaceC19549811eCLIZLLL2.LIZJ();
        }
    }
}
