package X;

import Y.ALAdapterS27S0200000_33;
import Y.AUListenerS235S0200000_33;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksOrderer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS682S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AHS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHS extends AbstractC21673619ry<C1AHY> {
    public static final float LLIZLLLIL;
    public static final float LLJ;
    public final List<C1AHW> LL;
    public final InterfaceC1631620sYq<Long, Long, Long, Unit> LLILLJJLI;
    public final boolean LLILLL;
    public final DataChannel LLILZ;
    public final C2176871AHl LLILZIL;
    public final float LLILZLL;
    public Long LLIZ;

    static {
        C1546210qL5.LIZ.getClass();
        LLIZLLLIL = C1546210qL5.LIZ(15);
        LLJ = C497740JfY.LJIIIZ(R.dimen.b2g);
    }

    public final List<C1AHW> LLLFZ() {
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        for (C1AHW c1ahw : this.LL) {
            c1ahw.getClass();
            ViewerPicksOrderer viewerPicksOrderer = new ViewerPicksOrderer();
            ViewerPicksOrderer viewerPicksOrderer2 = c1ahw.LIZIZ;
            viewerPicksOrderer.userId = viewerPicksOrderer2 != null ? viewerPicksOrderer2.userId : 0L;
            viewerPicksOrderer.avatar = viewerPicksOrderer2 != null ? viewerPicksOrderer2.avatar : null;
            String str4 = "";
            if (viewerPicksOrderer2 == null || (str = viewerPicksOrderer2.nickname) == null) {
                str = "";
            }
            viewerPicksOrderer.nickname = str;
            GiftPick giftPick = new GiftPick();
            GiftPick giftPick2 = c1ahw.LIZJ;
            giftPick.giftId = giftPick2 != null ? giftPick2.giftId : 0L;
            if (giftPick2 == null || (str2 = giftPick2.customizedDesc) == null) {
                str2 = "";
            }
            giftPick.customizedDesc = str2;
            giftPick.giftIcon = giftPick2 != null ? giftPick2.giftIcon : null;
            giftPick.giftPrice = giftPick2 != null ? giftPick2.giftPrice : 0L;
            giftPick.giftPickId = giftPick2 != null ? giftPick2.giftPickId : 0L;
            if (giftPick2 != null && (str3 = giftPick2.giftPickIdStr) != null) {
                str4 = str3;
            }
            giftPick.giftPickIdStr = str4;
            int i = 0;
            giftPick.isPriorityRequest = giftPick2 != null ? giftPick2.isPriorityRequest : false;
            if (giftPick2 != null) {
                i = giftPick2.descSource;
            }
            giftPick.descSource = i;
            arrayList.add(new C1AHW(c1ahw.LIZ, viewerPicksOrderer, giftPick, c1ahw.LIZLLL, c1ahw.LJ, c1ahw.LJFF));
        }
        return arrayList;
    }

    public final void LLLIIIIL() {
        Object next;
        if (this.LLIZ == null) {
            return;
        }
        List<C1AHW> listLLLFZ = LLLFZ();
        Iterator it2 = ((ArrayList) listLLLFZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            long j = ((C1AHW) next).LIZ;
            Long l = this.LLIZ;
            if (l != null && j == l.longValue()) {
                break;
            }
        }
        C1AHW c1ahw = (C1AHW) next;
        if (c1ahw == null) {
            return;
        }
        c1ahw.LIZLLL = false;
        this.LLIZ = null;
        LLLI(listLLLFZ, null);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1AHW c1ahw = (C1AHW) C13LP.LJJJLZIJ(i, this.LL);
        if (c1ahw == null || c1ahw.LIZ != -1) {
            return 0;
        }
        return 1;
    }

    public final void LLLI(List<C1AHW> list, Function0<Unit> function0) {
        C1AHW next;
        Iterator<C1AHW> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long j = next.LIZ;
                Long l = this.LLIZ;
                if (l != null && j == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1AHW c1ahw = next;
        if (c1ahw != null) {
            c1ahw.LIZLLL = true;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.addAll(this.LL);
        this.LL.clear();
        this.LL.addAll(list);
        if (function0 != null) {
            function0.invoke();
        }
        if (arrayList.isEmpty()) {
            notifyDataSetChanged();
        } else {
            C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.1AHU
                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return arrayList.size();
                }

                public static boolean LJFF(int i, List list2) {
                    C1AHW c1ahw2;
                    C1AHW c1ahw3;
                    if ((i == list2.size() - 1 && ((c1ahw3 = (C1AHW) C13LP.LJJJLZIJ(i, list2)) == null || c1ahw3.LIZ != -1)) || (i == list2.size() - 2 && (c1ahw2 = (C1AHW) C13LP.LJJLIIIJL(list2)) != null && c1ahw2.LIZ == -1)) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    Long lValueOf;
                    Long lValueOf2;
                    Long lValueOf3;
                    Long lValueOf4;
                    String str;
                    boolean z = false;
                    if (i >= 0 && i < arrayList.size() && i2 >= 0 && i2 < this.LL.size()) {
                        if (i == i2) {
                            boolean zLJFF = LJFF(i, arrayList);
                            boolean zLJFF2 = LJFF(i2, this.LL);
                            if (zLJFF ? zLJFF2 : !zLJFF2) {
                                if (((C1AHW) ListProtector.get(arrayList, i)).LIZLLL == ((C1AHW) ListProtector.get(this.LL, i2)).LIZLLL && ((C1AHW) ListProtector.get(arrayList, i)).LIZ == ((C1AHW) ListProtector.get(this.LL, i2)).LIZ) {
                                    ViewerPicksOrderer viewerPicksOrderer = ((C1AHW) ListProtector.get(arrayList, i)).LIZIZ;
                                    String str2 = null;
                                    if (viewerPicksOrderer != null) {
                                        lValueOf = Long.valueOf(viewerPicksOrderer.userId);
                                    } else {
                                        lValueOf = null;
                                    }
                                    ViewerPicksOrderer viewerPicksOrderer2 = ((C1AHW) ListProtector.get(this.LL, i2)).LIZIZ;
                                    if (viewerPicksOrderer2 != null) {
                                        lValueOf2 = Long.valueOf(viewerPicksOrderer2.userId);
                                    } else {
                                        lValueOf2 = null;
                                    }
                                    if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                        GiftPick giftPick = ((C1AHW) ListProtector.get(arrayList, i)).LIZJ;
                                        if (giftPick != null) {
                                            lValueOf3 = Long.valueOf(giftPick.giftId);
                                        } else {
                                            lValueOf3 = null;
                                        }
                                        GiftPick giftPick2 = ((C1AHW) ListProtector.get(this.LL, i2)).LIZJ;
                                        if (giftPick2 != null) {
                                            lValueOf4 = Long.valueOf(giftPick2.giftId);
                                        } else {
                                            lValueOf4 = null;
                                        }
                                        if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                                            GiftPick giftPick3 = ((C1AHW) ListProtector.get(arrayList, i)).LIZJ;
                                            if (giftPick3 != null) {
                                                str = giftPick3.customizedDesc;
                                            } else {
                                                str = null;
                                            }
                                            GiftPick giftPick4 = ((C1AHW) ListProtector.get(this.LL, i2)).LIZJ;
                                            if (giftPick4 != null) {
                                                str2 = giftPick4.customizedDesc;
                                            }
                                            if (Intrinsics.LJFF(str, str2)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((C1AHW) ListProtector.get(arrayList, i)).LIZLLL && !((C1AHW) ListProtector.get(this.LL, i2)).LIZLLL) {
                            ((C1AHW) ListProtector.get(this.LL, i2)).LJ = true;
                        }
                    }
                    return z;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    Long lValueOf;
                    C1AHW c1ahw2 = (C1AHW) C13LP.LJJJLZIJ(i, arrayList);
                    Long lValueOf2 = null;
                    if (c1ahw2 != null) {
                        lValueOf = Long.valueOf(c1ahw2.LIZ);
                    } else {
                        lValueOf = null;
                    }
                    C1AHW c1ahw3 = (C1AHW) C13LP.LJJJLZIJ(i2, this.LL);
                    if (c1ahw3 != null) {
                        lValueOf2 = Long.valueOf(c1ahw3.LIZ);
                    }
                    return Intrinsics.LJFF(lValueOf, lValueOf2);
                }
            }, true).LIZJ(this);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String str;
        ImageModel imageModel;
        Long lValueOf;
        Long lValueOf2;
        ImageModel imageModel2;
        String str2;
        final C1AHW c1ahw;
        C1AHY c1ahy = (C1AHY) viewHolder;
        if (c1ahy instanceof C1AHV) {
            final C1AHV c1ahv = (C1AHV) c1ahy;
            C1AHW c1ahw2 = (C1AHW) C13LP.LJJJLZIJ(i, this.LL);
            if (c1ahw2 != null) {
                c1ahv.LLILZ.setText(String.valueOf(i + 1));
                C16F5 c16f5 = c1ahv.LLILZIL;
                GiftPick giftPick = c1ahw2.LIZJ;
                String str3 = "";
                if (giftPick == null || (str = giftPick.customizedDesc) == null) {
                    str = "";
                }
                c16f5.setText(str);
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                GiftPick giftPick2 = c1ahw2.LIZJ;
                if (giftPick2 != null) {
                    imageModel = giftPick2.giftIcon;
                } else {
                    imageModel = null;
                }
                c0jbnLIZ.LJIIIZ(imageModel).LJJI(c1ahv.LLILLL);
                GiftPick giftPick3 = c1ahw2.LIZJ;
                if (giftPick3 != null && giftPick3.isPriorityRequest) {
                    C786410Ut5.LJLLLLLL(0, c1ahv.LLILZLL);
                } else {
                    C786410Ut5.LJLLLLLL(8, c1ahv.LLILZLL);
                }
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser != null) {
                    lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
                } else {
                    lValueOf = null;
                }
                ViewerPicksOrderer viewerPicksOrderer = c1ahw2.LIZIZ;
                if (viewerPicksOrderer != null) {
                    lValueOf2 = Long.valueOf(viewerPicksOrderer.userId);
                } else {
                    lValueOf2 = null;
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    C500260Jjc.LLFFF(c1ahv.LLIZ);
                    C500260Jjc.LJIILIIL(c1ahv.LLIZLLLIL);
                    C500260Jjc.LJIILIIL(c1ahv.LLJ);
                } else {
                    C500260Jjc.LJIILIIL(c1ahv.LLIZ);
                    C500260Jjc.LLFFF(c1ahv.LLIZLLLIL);
                    C500260Jjc.LLFFF(c1ahv.LLJ);
                    C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
                    ViewerPicksOrderer viewerPicksOrderer2 = c1ahw2.LIZIZ;
                    if (viewerPicksOrderer2 != null) {
                        imageModel2 = viewerPicksOrderer2.avatar;
                    } else {
                        imageModel2 = null;
                    }
                    c0jbnLIZ2.LJIIIZ(imageModel2).LJJI(c1ahv.LLIZLLLIL);
                    C16F5 c16f52 = c1ahv.LLJ;
                    ViewerPicksOrderer viewerPicksOrderer3 = c1ahw2.LIZIZ;
                    if (viewerPicksOrderer3 != null && (str2 = viewerPicksOrderer3.nickname) != null) {
                        str3 = str2;
                    }
                    c16f52.setText(str3);
                }
                C1AHW c1ahw3 = (C1AHW) C13LP.LJJLIIIJL(this.LL);
                if (c1ahw3 == null || c1ahw3.LIZ != -1 ? i < this.LL.size() - 1 : i < this.LL.size() - 2) {
                    C500260Jjc.LLFFF(c1ahv.LLJI);
                } else {
                    C500260Jjc.LJIILIIL(c1ahv.LLJI);
                }
                if (this.LLILLL && (c1ahw = (C1AHW) C13LP.LJJJLZIJ(i, this.LL)) != null) {
                    ValueAnimator valueAnimator = c1ahv.LLJILLL;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                    }
                    ValueAnimator valueAnimator2 = c1ahv.LLJILLL;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    c1ahv.LLJILLL = null;
                    c1ahv.LLJIJIL = 0.0f;
                    c1ahv.LLJILJIL = 0.0f;
                    c1ahv.LLJILJILJ = false;
                    if (c1ahw.LJFF) {
                        c1ahw.LJFF = false;
                        c1ahw.LIZLLL = true;
                        this.LLIZ = Long.valueOf(c1ahw.LIZ);
                        LLLII(c1ahv, true, new AwS261S0300000_17(c1ahv, this, c1ahw, 14));
                    } else if (c1ahw.LJ) {
                        c1ahw.LJ = false;
                        int i2 = -C497740JfY.LJIIIZ(R.dimen.b2g);
                        if (C497740JfY.LJJ()) {
                            i2 = -i2;
                        }
                        float f = i2;
                        C786410Ut5.Jc(c1ahv.LL, f);
                        C786410Ut5.Jc(c1ahv.LLILLJJLI, f);
                        LLLII(c1ahv, false, AFwS224S0000000_33.get$arr$(583));
                    } else if (c1ahw.LIZLLL) {
                        int i3 = -C497740JfY.LJIIIZ(R.dimen.b2g);
                        if (C497740JfY.LJJ()) {
                            i3 = -i3;
                        }
                        float f2 = i3;
                        C786410Ut5.Jc(c1ahv.LL, f2);
                        C786410Ut5.Jc(c1ahv.LLILLJJLI, f2);
                    } else {
                        C786410Ut5.Jc(c1ahv.LL, 0.0f);
                        C786410Ut5.Jc(c1ahv.LLILLJJLI, 0.0f);
                    }
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.1AHd
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view) {
                            long j;
                            long j2;
                            boolean z;
                            String str4;
                            Object objValueOf;
                            GiftPick giftPick4;
                            if (view != null) {
                                long j3 = c1ahw.LIZ;
                                Long l = this.LLIZ;
                                if (l != null && j3 == l.longValue()) {
                                    InterfaceC1631620sYq<Long, Long, Long, Unit> interfaceC1631620sYq = this.LLILLJJLI;
                                    Long lValueOf3 = Long.valueOf(c1ahw.LIZ);
                                    ViewerPicksOrderer viewerPicksOrderer4 = c1ahw.LIZIZ;
                                    long j4 = 0;
                                    if (viewerPicksOrderer4 != null) {
                                        j = viewerPicksOrderer4.userId;
                                    } else {
                                        j = 0;
                                    }
                                    Long lValueOf4 = Long.valueOf(j);
                                    GiftPick giftPick5 = c1ahw.LIZJ;
                                    if (giftPick5 != null) {
                                        j2 = giftPick5.giftPickId;
                                    } else {
                                        j2 = 0;
                                    }
                                    interfaceC1631620sYq.invoke(lValueOf3, lValueOf4, Long.valueOf(j2));
                                    C1AHW c1ahw4 = (C1AHW) C13LP.LJJJLL(this.LL);
                                    if (c1ahw4 != null && (giftPick4 = c1ahw4.LIZJ) != null && giftPick4.isPriorityRequest) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    int i4 = i + 1;
                                    GiftPick giftPick6 = c1ahw.LIZJ;
                                    if (giftPick6 == null || (str4 = giftPick6.customizedDesc) == null) {
                                        str4 = "";
                                    }
                                    C1AHS c1ahs = this;
                                    C2176871AHl c2176871AHl = c1ahs.LLILZIL;
                                    if (c2176871AHl != null) {
                                        j4 = c2176871AHl.LIZJ;
                                    }
                                    C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, boolValueOf, null, null, i4, str4, j4 - 1, -1, 1863679);
                                    C1AI1.LIZ(c1ai2, c1ahs.LLILZ, c1ahs.LLILLL);
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_queue_clear");
                                    c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
                                    c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
                                    Boolean bool = c1ai2.LJJJI;
                                    if (bool != null) {
                                        objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                                    } else {
                                        objValueOf = null;
                                    }
                                    c474500IjALIZ.LJJII(objValueOf, "is_front_row_wish");
                                    c474500IjALIZ.LJJII(Integer.valueOf(c1ai2.LJJJJI), "user_rank");
                                    c474500IjALIZ.LJJII(c1ai2.LJJJJIZL, "user_wish_content");
                                    c474500IjALIZ.LJJII(Long.valueOf(c1ai2.LJJJJJ), "total_wishes_cnt");
                                    c474500IjALIZ.LIZ();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, c1ahv.LLILLJJLI);
                    c1ahv.LL.setOnTouchListener(new View.OnTouchListener() { // from class: X.1AHT
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Long lValueOf3;
                            boolean z;
                            C1AHW next;
                            int action;
                            boolean z2;
                            float fLIZLLL;
                            if (motionEvent == null) {
                                return false;
                            }
                            List<C1AHW> list = this.LL;
                            C1AHW c1ahw4 = c1ahw;
                            Iterator<C1AHW> it2 = list.iterator();
                            while (true) {
                                lValueOf3 = null;
                                z = true;
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.LIZ == c1ahw4.LIZ) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            C1AHW c1ahw5 = next;
                            if (c1ahw5 == null) {
                                return false;
                            }
                            boolean z3 = !c1ahv.isRecyclable();
                            if (z3) {
                                action = 3;
                            } else {
                                action = motionEvent.getAction() & 255;
                                if (action == 0) {
                                    c1ahv.LLJIJIL = motionEvent.getRawX();
                                    C1AHV c1ahv2 = c1ahv;
                                    c1ahv2.LLJILJILJ = false;
                                    c1ahv2.LLJILJIL = c1ahv2.LL.getTranslationX();
                                    long j = c1ahw.LIZ;
                                    Long l = this.LLIZ;
                                    if (l == null || j != l.longValue()) {
                                        this.LLLIIIIL();
                                    }
                                    this.getClass();
                                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                                    C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_VIEWER_WISHES_QUEUE);
                                    return true;
                                }
                            }
                            if (action != 1) {
                                if (action != 2) {
                                    if (action != 3) {
                                        return false;
                                    }
                                } else {
                                    float rawX = motionEvent.getRawX();
                                    C1AHV c1ahv3 = c1ahv;
                                    float f3 = rawX - c1ahv3.LLJIJIL;
                                    if (!c1ahv3.LLJILJILJ && Math.abs(f3) > C1AHS.LLIZLLLIL) {
                                        C1AHV c1ahv4 = c1ahv;
                                        c1ahv4.LLJILJILJ = true;
                                        ViewParent parent = c1ahv4.itemView.getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                    if (!c1ahv.LLJILJILJ) {
                                        return false;
                                    }
                                    if (!C497740JfY.LJJ()) {
                                        fLIZLLL = C13LZ.LIZLLL(c1ahv.LLJILJIL + f3, this.LLILZLL, 0.0f);
                                    } else {
                                        fLIZLLL = C13LZ.LIZLLL(c1ahv.LLJILJIL + f3, 0.0f, this.LLILZLL);
                                    }
                                    if (c1ahv.LL.getTranslationX() != fLIZLLL) {
                                        C1AHS c1ahs = this;
                                        C1AHV c1ahv5 = c1ahv;
                                        c1ahs.getClass();
                                        C786410Ut5.Jc(c1ahv5.LL, fLIZLLL);
                                        C786410Ut5.Jc(c1ahv5.LLILLJJLI, fLIZLLL);
                                    }
                                    return true;
                                }
                            }
                            C1AHV c1ahv6 = c1ahv;
                            boolean z4 = c1ahv6.LLJILJILJ;
                            c1ahv6.LLJILJILJ = false;
                            ViewParent parent2 = c1ahv6.itemView.getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(false);
                            }
                            if (!z4) {
                                return false;
                            }
                            if (Math.abs(c1ahv.LL.getTranslationX()) < C1AHS.LLJ / 2) {
                                z = false;
                            }
                            if (z3 && (z2 = c1ahw5.LIZLLL) != z) {
                                z = z2;
                            }
                            this.LLLII(c1ahv, z, AFwS224S0000000_33.get$arr$(583));
                            c1ahw5.LIZLLL = z;
                            C1AHS c1ahs2 = this;
                            if (z) {
                                lValueOf3 = Long.valueOf(c1ahw.LIZ);
                            }
                            c1ahs2.LLIZ = lValueOf3;
                            return false;
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (!(c1ahy instanceof C1AHX)) {
            return;
        }
        C1AHX c1ahx = (C1AHX) c1ahy;
        C500260Jjc.LJIILIIL(c1ahx.LL);
        C500260Jjc.LLFFF(c1ahx.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1ahv;
        if (i != 0) {
            if (i != 1) {
                c1ahv = new C1AHY(viewGroup);
            } else {
                int i2 = C1AHX.LLILLJJLI;
                c1ahv = new C1AHX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hwy, viewGroup, false));
            }
        } else {
            int i3 = C1AHV.LLJJ;
            c1ahv = new C1AHV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hwx, viewGroup, false));
        }
        try {
            View view = c1ahv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1ahv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1ahv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1ahv.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1ahv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1ahv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1ahv.getClass().getName();
        return c1ahv;
    }

    public final void LLLII(C1AHV c1ahv, boolean z, Function0<Unit> function0) {
        float f;
        float translationX = c1ahv.LL.getTranslationX();
        if (z) {
            f = this.LLILZLL;
        } else {
            f = 0.0f;
        }
        float fAbs = (300 * Math.abs(translationX - f)) / LLJ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationX, f);
        valueAnimatorOfFloat.setDuration((long) fAbs);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS235S0200000_33(this, c1ahv, 6));
        valueAnimatorOfFloat.addListener(new ALAdapterS27S0200000_33(c1ahv, function0, 6));
        valueAnimatorOfFloat.start();
        c1ahv.LLJILLL = valueAnimatorOfFloat;
    }

    public C1AHS(List list, AwS682S0100000_33 awS682S0100000_33, boolean z, DataChannel dataChannel, C2176871AHl c2176871AHl) {
        float f;
        this.LL = list;
        this.LLILLJJLI = awS682S0100000_33;
        this.LLILLL = z;
        this.LLILZ = dataChannel;
        this.LLILZIL = c2176871AHl;
        if (C497740JfY.LJJ()) {
            f = LLJ;
        } else {
            f = -LLJ;
        }
        this.LLILZLL = f;
    }
}
