package X;

import Y.ACListenerS111S0200000_7;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchAweme;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471910Iez extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final List<LiveSearchAweme> LL = new ArrayList();
    public final List<Long> LLILLJJLI = new CopyOnWriteArrayList();
    public EnumC471940If2 LLILLL = EnumC471940If2.DEFAULT;
    public final C471930If1 LLIZ = new C0IYF() { // from class: X.0If1
        @Override // X.C0IYF
        public final long[] LIZ() {
            List<LiveSearchAweme> list = this.LIZ.LL;
            ArrayList arrayList = new ArrayList();
            for (LiveSearchAweme liveSearchAweme : list) {
                LiveSearchAweme liveSearchAweme2 = liveSearchAweme;
                if (Intrinsics.LJFF(liveSearchAweme2.LIZIZ, C472010If9.LIZIZ) || Intrinsics.LJFF(liveSearchAweme2.LIZIZ, C472020IfA.LIZIZ)) {
                    arrayList.add(liveSearchAweme);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                long id = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Room roomLIZ = ((LiveSearchAweme) it2.next()).LIZ();
                if (roomLIZ != null) {
                    id = roomLIZ.getId();
                }
                arrayList2.add(Long.valueOf(id));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((Number) obj).longValue() > 0) {
                    arrayList3.add(obj);
                }
            }
            return C13LP.LLIIIILZ(arrayList3);
        }

        @Override // X.C0IYF
        public final void LIZIZ() {
            this.LIZ.LLILZLL = true;
        }
    };

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size = ((ArrayList) this.LL).size();
        return ((ArrayList) this.LL).size() > 0 ? size + 1 : size;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < ((ArrayList) this.LL).size()) {
            AbstractC472000If8 abstractC472000If8 = ((LiveSearchAweme) ListProtector.get(this.LL, i)).LIZIZ;
            if (!(abstractC472000If8 instanceof C472010If9) && !Intrinsics.LJFF(abstractC472000If8, C472020IfA.LIZIZ)) {
                if (abstractC472000If8 instanceof C471950If3) {
                    return 2;
                }
                throw new C1954807lC();
            }
            return 1;
        }
        return 3;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C471920If0) {
            ((C471920If0) viewHolder).L5();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LiveSearchAweme liveSearchAweme;
        int i2;
        Room roomLIZ;
        List<String> listLIZ = null;
        if (i < ((ArrayList) this.LL).size()) {
            liveSearchAweme = (LiveSearchAweme) ListProtector.get(this.LL, i);
        } else {
            liveSearchAweme = null;
        }
        if (viewHolder instanceof C471920If0) {
            C471920If0 c471920If0 = (C471920If0) viewHolder;
            int i3 = this.LLILZIL;
            if (i < i3) {
                i2 = i;
            } else if (i == i3) {
                i2 = -1;
            } else {
                i2 = (i - i3) - 1;
            }
            c471920If0.LLJJI = i;
            c471920If0.LLJJIII = i2;
            c471920If0.LLJILLL = liveSearchAweme;
            if (liveSearchAweme != null) {
                roomLIZ = liveSearchAweme.LIZ();
            } else {
                roomLIZ = null;
            }
            c471920If0.LLJJ = roomLIZ;
            if (roomLIZ != null) {
                if (!TextUtils.isEmpty(roomLIZ.getTitle())) {
                    c471920If0.LLILZ.setText(C341701Uh.LIZ("%s", roomLIZ.getTitle()));
                } else {
                    c471920If0.LLILZ.setText((CharSequence) null);
                }
                if (C497740JfY.LJJ()) {
                    c471920If0.LLILZ.setGravity(5);
                    c471920If0.LLJILJILJ.setGravity(5);
                } else {
                    c471920If0.LLILZ.setGravity(3);
                    c471920If0.LLJILJILJ.setGravity(3);
                }
                ImageModel cover = roomLIZ.getCover();
                if (roomLIZ.getSquareCoverImg() != null && !C0IKQ.LIZ(roomLIZ.getSquareCoverImg().getUrls())) {
                    cover = roomLIZ.getSquareCoverImg();
                }
                if (cover != null && !C0IKQ.LIZ(cover.getUrls())) {
                    c471920If0.P5(cover.getWidth(), cover.getHeight());
                    C1324610kZf c1324610kZfLJIIIIZZ = C1819620xS4.LIZ().LJIIIIZZ("drawer_cover", C842240X2g.LIZ(cover));
                    c1324610kZfLJIIIIZZ.LJI = -1;
                    c1324610kZfLJIIIIZZ.LJII = -1;
                    c1324610kZfLJIIIIZZ.LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                    c1324610kZfLJIIIIZZ.LJJI(c471920If0.LLILZIL);
                } else {
                    c471920If0.LLILZIL.setImageResource(R.drawable.ehd);
                    C786410Ut5.LJLLLLLL(8, c471920If0.LLIZ);
                    C786410Ut5.LJLLLLLL(8, c471920If0.LLIZLLLIL);
                    if (cover == null) {
                        c471920If0.P5(0, 0);
                    } else {
                        c471920If0.P5(cover.width, cover.height);
                    }
                }
                if (roomLIZ.getStatus() == 4) {
                    c471920If0.LLILZLL.setText(C470340IcS.LIZ(0L));
                } else {
                    c471920If0.LLILZLL.setText(C470340IcS.LIZ(roomLIZ.getUserCount()));
                }
                C786410Ut5.LJLLLLLL(8, c471920If0.LLIZ);
                c471920If0.LLIZ.setBackgroundResource(0);
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), c471920If0.LLIZLLLIL);
                C786410Ut5.LJLLLLLL(0, c471920If0.LLIZLLLIL);
                c471920If0.LLIZLLLIL.setBackgroundResource(R.drawable.dxo);
                User owner = roomLIZ.getOwner();
                if (owner != null) {
                    C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null) {
                        listLIZ = C842240X2g.LIZ(avatarThumb);
                    }
                    C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
                    int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(13.0f);
                    c1324610kZfLIZJ.LJI = iLIZIZ;
                    c1324610kZfLIZJ.LJII = iLIZIZ2;
                    Boolean bool = Boolean.TRUE;
                    c1324610kZfLIZJ.LJJ = bool;
                    c1324610kZfLIZJ.LJIILIIL = bool;
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    c1324610kZfLIZJ.LJJI(c471920If0.LLJILJIL);
                    c471920If0.LLJILJILJ.setText(C0KVU.LIZ(owner));
                }
                C786410Ut5.I7(new ACListenerS111S0200000_7(c471920If0, roomLIZ, 0), c471920If0.itemView);
                return;
            }
            return;
        }
        if (viewHolder instanceof C471990If7) {
            C471990If7 c471990If7 = (C471990If7) viewHolder;
            c471990If7.getClass();
            if (liveSearchAweme == null) {
                return;
            }
            AbstractC472000If8 abstractC472000If8 = liveSearchAweme.LIZIZ;
            if (!(abstractC472000If8 instanceof C471950If3)) {
                return;
            }
            int i4 = C471960If4.LIZ[((C471950If3) abstractC472000If8).LIZIZ.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    C439101nJ.LJI(c471990If7.LLILLJJLI);
                    C12ES.LJIILL(0, c471990If7.LLILLL);
                    return;
                }
                throw new C1954807lC();
            }
            C12ES.LJIILL(0, c471990If7.LLILLJJLI);
            C439101nJ.LJI(c471990If7.LLILLL);
            return;
        }
        if (!(viewHolder instanceof C471980If6)) {
            return;
        }
        C471980If6 c471980If6 = (C471980If6) viewHolder;
        if (this.LLILZ) {
            C786410Ut5.LLLIZZ(c471980If6.LLILLJJLI, 0);
            C439101nJ.LJI(c471980If6.LLILLL);
        } else {
            C786410Ut5.LLLIZZ(c471980If6.LLILLJJLI, 8);
            C12ES.LJIILL(0, c471980If6.LLILLL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c471920If0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i2 = C471920If0.LLJJIJI;
                    c471920If0 = new C471920If0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.guv, viewGroup, false), viewGroup, this.LLIZ);
                } else {
                    int i3 = C471980If6.LLILZ;
                    c471920If0 = new C471980If6(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.guu, viewGroup, false), viewGroup);
                }
            } else {
                int i4 = C471990If7.LLILZ;
                c471920If0 = new C471990If7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.guw, viewGroup, false), viewGroup);
            }
        } else {
            int i5 = C471920If0.LLJJIJI;
            c471920If0 = new C471920If0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.guv, viewGroup, false), viewGroup, this.LLIZ);
        }
        try {
            View view = c471920If0.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c471920If0.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c471920If0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c471920If0.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c471920If0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c471920If0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c471920If0.getClass().getName();
        return c471920If0;
    }

    public final void LLLFZ(List<LiveSearchAweme> list, boolean z, EnumC471940If2 enumC471940If2) {
        ((ArrayList) this.LL).clear();
        ((CopyOnWriteArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LL).addAll(list);
        this.LLILZ = z;
        this.LLILLL = enumC471940If2;
        this.LLILZIL = ((ArrayList) list).size();
        notifyDataSetChanged();
    }
}
