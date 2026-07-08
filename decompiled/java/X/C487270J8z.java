package X;

import Y.ARunnableS107S0100000_7;
import Y.AfS103S0300000_7;
import Y.AfS176S0100000_7;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleSettings;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Pair;
import webcast.api.room.FrequencyControlData;

/* JADX INFO: renamed from: X.0J8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487270J8z implements C0J6Q {
    public C19EG LIZ;
    public BPEAHandler LIZIZ;
    public String LIZJ = "For You";
    public String LIZLLL = "HOME";
    public C487260J8y LJ;
    public View LJFF;
    public C487250J8x LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    @Override // X.C0J6Q
    public final void LJIIIIZZ() {
    }

    @Override // X.C0J6Q
    public final void LJIIIZ(long j, Pair pair) {
    }

    @Override // X.C0J6Q
    public final String LJIIJ() {
        return "";
    }

    @Override // X.C0J6Q
    public final boolean LJI() {
        C487250J8x c487250J8x = this.LJI;
        if (c487250J8x != null) {
            return c487250J8x.isShowing();
        }
        return false;
    }

    public final void LJIILL() {
        C19EG c19eg = this.LIZ;
        if (c19eg != null) {
            try {
                C487250J8x c487250J8x = new C487250J8x(c19eg);
                this.LJI = c487250J8x;
                c487250J8x.LIZJ = this.LJFF;
                C487260J8y c487260J8y = this.LJ;
                if (c487260J8y != null) {
                    c487250J8x.LJ.add(c487260J8y);
                }
                LJIILJJIL(c19eg, c487250J8x);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean LJIIL() {
        int expGroup;
        return C0BK6.LIZ() && 2 <= (expGroup = FollowLiveBubbleSettings.INSTANCE.getExpGroup()) && expGroup < 4;
    }

    public final void LJIIJJI() {
        C487250J8x c487250J8x;
        if (!LJIIL() || (c487250J8x = this.LJI) == null) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        C0J90 c0j90 = C0J9F.LIZJ;
        c0j90.LIZ = -1;
        c0j90.LIZIZ = 0;
        c0j90.LIZJ = arrayList;
        c487250J8x.LLZZ();
    }

    @Override // X.C0J6Q
    public final void dispose() {
        if (LJIIL()) {
            this.LIZ = null;
            this.LIZIZ = null;
            this.LJFF = null;
            this.LJ = null;
        }
    }

    @Override // X.C0J6Q
    public final void LIZ(View view) {
        if (LJIIL()) {
            this.LJFF = view;
        }
    }

    @Override // X.C0J6Q
    public final void LIZJ(C19EG c19eg) {
        if (LJIIL()) {
            this.LJII = false;
            this.LIZ = c19eg;
            this.LIZIZ = new BPEAHandler(Looper.getMainLooper());
        }
    }

    @Override // X.C0J6Q
    public final void LIZLLL(boolean z) {
        if (LJIIL() && z) {
            if (LJI()) {
                LJIIJJI();
            }
            if (this.LJIIJ) {
                PopupManager.LJIIJ(C607390Ns1.class, C20660315sv.LL);
                this.LJIIJ = false;
            }
            this.LJIIJJI = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0J8y] */
    @Override // X.C0J6Q
    public final void LJ(final InterfaceC482890Iwh interfaceC482890Iwh) {
        if (LJIIL()) {
            this.LJ = new InterfaceC482890Iwh() { // from class: X.0J8y
                @Override // X.InterfaceC482890Iwh
                public final void LIZ() {
                    InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                    if (interfaceC482890Iwh2 != null) {
                        interfaceC482890Iwh2.LIZ();
                    }
                }

                @Override // X.InterfaceC482890Iwh
                public final void LIZIZ() {
                    InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                    if (interfaceC482890Iwh2 != null) {
                        interfaceC482890Iwh2.LIZIZ();
                    }
                    C487250J8x c487250J8x = this.LJI;
                    if (c487250J8x != null) {
                        HashSet<C0J9E> hashSet = C0J9F.LIZ;
                        synchronized (hashSet) {
                            try {
                                hashSet.remove(c487250J8x);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    this.LJI = null;
                }

                @Override // X.InterfaceC482890Iwh
                public final void LIZJ() {
                    InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                    if (interfaceC482890Iwh2 != null) {
                        interfaceC482890Iwh2.LIZJ();
                    }
                    C487250J8x c487250J8x = this.LJI;
                    if (c487250J8x != null) {
                        HashSet<C0J9E> hashSet = C0J9F.LIZ;
                        synchronized (hashSet) {
                            try {
                                hashSet.add(c487250J8x);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            };
        }
    }

    @Override // X.C0J6Q
    public final void LJFF(String str) {
        if (LJIIL()) {
            if (str != null) {
                this.LIZLLL = str;
            }
            if (LJI()) {
                LJIIJJI();
            }
            if (this.LJIIJ) {
                PopupManager.LJIIJ(C607390Ns1.class, C20660315sv.LL);
                this.LJIIJ = false;
            }
        }
    }

    @Override // X.C0J6Q
    public final void LJII(String str) {
        if (LJIIL()) {
            if (str != null) {
                this.LIZJ = str;
            }
            if (LJI()) {
                LJIIJJI();
            }
            if (this.LJIIJ) {
                PopupManager.LJIIJ(C607390Ns1.class, C20660315sv.LL);
                this.LJIIJ = false;
            }
            if (this.LJIIIZ && TextUtils.equals(str, "Following")) {
                this.LJIIIZ = false;
                Live.getService().LLFF(2, 0L, "", new C08MM() { // from class: X.0J91
                    @Override // X.C08MM
                    public final void LIZ() {
                    }

                    @Override // X.C08MM
                    public final void LIZIZ(FrequencyControlData frequencyControlData) {
                    }

                    @Override // X.C08MM
                    public final void onFailed() {
                    }
                });
            }
        }
    }

    public static void LJIILIIL(TuxIconView tuxIconView, FeedItem feedItem) {
        User owner;
        ImageModel avatarThumb;
        Room room = feedItem.getRoom();
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            C1324610kZf c1324610kZfLJIJJ = C1819620xS4.LIZ().LJIJJ(R.drawable.ela);
            c1324610kZfLJIJJ.LJIIIZ(avatarThumb);
            c1324610kZfLJIJJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIJJ.LJJI(tuxIconView);
            C786410Ut5.LJLLLLLL(0, tuxIconView);
        }
    }

    @Override // X.C0J6Q
    public final void LIZIZ(String str, boolean z) {
        if (!LJIIL() || this.LJII) {
            return;
        }
        this.LJII = true;
        if (z) {
            BPEAHandler bPEAHandler = this.LIZIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJLIIL(10000L, bPEAHandler, new ARunnableS107S0100000_7(this, 152));
                return;
            }
            return;
        }
        LJIILL();
    }

    public final void LJIILJJIL(C19EG c19eg, C487250J8x c487250J8x) {
        Long lLIZIZ = InterfaceC1106030et7.n6.LIZIZ();
        if ((!Keva.getRepo("debug_follow_live").getBoolean("no_time_limit", false) && System.currentTimeMillis() < lLIZIZ.longValue() + (((long) FollowLiveBubbleSettings.INSTANCE.getDiffTime()) * 1000)) || this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        C480460Ism.LIZ().getClass();
        ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed("/webcast/feed/", 0L, "tiktok_follow_high_value_bubble", new LinkedHashMap()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS103S0300000_7(c19eg, this, c487250J8x, 6), new AfS176S0100000_7(this, 127));
    }
}
