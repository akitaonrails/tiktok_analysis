package X;

import Y.ACListenerS51S0101000_7;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0INL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0INL extends AbstractC21673619ry<C0INM> {
    public List<Room> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<Room> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Room room;
        ViewGroup.LayoutParams layoutParams;
        ImageModel cover;
        String title;
        boolean z;
        User owner;
        long userCount;
        Long lValueOf;
        TextView textView;
        String str;
        OfficialChannelInfo officialChannelInfo;
        OfficialChannelInfo officialChannelInfo2;
        TextView textView2;
        View viewFindViewById;
        User owner2;
        FollowInfo followInfo;
        List urls;
        ViewGroup viewGroup;
        C0INM c0inm = (C0INM) viewHolder;
        List<Room> list = c0inm.LL.LL;
        User user = null;
        if (list != null) {
            room = (Room) ListProtector.get(list, i);
        } else {
            room = null;
        }
        View view = c0inm.itemView;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(171.0f);
            }
        } else {
            layoutParams = null;
        }
        View view2 = c0inm.itemView;
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
            C786410Ut5.X5(layoutParams, viewGroup);
        }
        ImageView imageView = (ImageView) c0inm.itemView.findViewById(R.id.tqn);
        if (imageView != null) {
            C0INL c0inl = c0inm.LL;
            if (room != null) {
                cover = room.getCover();
                if (room.getSquareCoverImg() != null) {
                    ImageModel squareCoverImg = room.getSquareCoverImg();
                    if (squareCoverImg != null) {
                        urls = squareCoverImg.getUrls();
                    } else {
                        urls = null;
                    }
                    if (!C0IKQ.LIZ(urls)) {
                        cover = room.getSquareCoverImg();
                    }
                }
                if (cover == null && room != null && room.getOwner() != null) {
                    cover = room.getOwner().getAvatarMedium();
                }
            } else {
                cover = null;
            }
            C0JSS.LJI(imageView, cover, R.drawable.dqt, 2);
            TextView textView3 = (TextView) c0inm.itemView.findViewById(R.id.tqw);
            if (room != null) {
                title = room.getTitle();
            } else {
                title = null;
            }
            if (title != null && title.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C786410Ut5.LLIL(textView3, 8);
            } else {
                textView3.setText(title);
            }
            C16F5 c16f5 = (C16F5) c0inm.itemView.findViewById(R.id.b0x);
            if (room != null) {
                owner = room.getOwner();
            } else {
                owner = null;
            }
            String strLIZ = C0KVU.LIZ(owner);
            if (strLIZ.length() == 0) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            } else {
                c16f5.setText(strLIZ);
            }
            TextView textView4 = (TextView) c0inm.itemView.findViewById(R.id.tqm);
            if (room != null) {
                userCount = room.getUserCount();
            } else {
                userCount = 0;
            }
            textView4.setText(C0IMV.LIZ(userCount));
            C786410Ut5.I7(new ACListenerS51S0101000_7(i, c0inl, 1), c0inm.itemView);
            if (room != null && (owner2 = room.getOwner()) != null && (followInfo = owner2.getFollowInfo()) != null) {
                lValueOf = Long.valueOf(followInfo.getFollowStatus());
            } else {
                lValueOf = null;
            }
            if (lValueOf != null && (lValueOf.longValue() == 1 || lValueOf.longValue() == 2)) {
                View viewFindViewById2 = c0inm.itemView.findViewById(R.id.igq);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
                if (C497740JfY.LJJ() && (viewFindViewById = c0inm.itemView.findViewById(R.id.igq)) != null) {
                    viewFindViewById.setBackgroundResource(R.drawable.dy0);
                }
                if (C497740JfY.LJJ()) {
                    View viewFindViewById3 = c0inm.itemView.findViewById(R.id.n1c);
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setBackgroundResource(R.drawable.dyi);
                    }
                } else {
                    View viewFindViewById4 = c0inm.itemView.findViewById(R.id.n1c);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.setBackgroundResource(R.drawable.dyh);
                    }
                }
            }
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.n42(room)) {
                if (lValueOf != null && (lValueOf.longValue() == 1 || lValueOf.longValue() == 2)) {
                    View viewFindViewById5 = c0inm.itemView.findViewById(R.id.n1c);
                    if ((viewFindViewById5 instanceof TextView) && (textView2 = (TextView) viewFindViewById5) != null) {
                        textView2.setText(2131842407);
                    }
                } else {
                    View viewFindViewById6 = c0inm.itemView.findViewById(R.id.n1c);
                    if ((viewFindViewById6 instanceof TextView) && (textView = (TextView) viewFindViewById6) != null) {
                        textView.setText(2131842931);
                    }
                }
                if (room != null && (officialChannelInfo2 = room.officialChannelInfo) != null) {
                    str = officialChannelInfo2.channelName;
                } else {
                    str = null;
                }
                textView3.setText(str);
                if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
                    user = officialChannelInfo.channelUser;
                }
                c16f5.setText(C0KVU.LIZ(user));
            }
            c0inm.itemView.setTag(room);
            if (room != null && !TextUtils.isEmpty(room.getMultiStreamData())) {
                HashMap map = new HashMap();
                map.put("enter_from_merge", "live_end");
                map.put("enter_method", "live_cover");
                map.put("stream_info", room.getMultiStreamData());
                String strLIZLLL = C1058250de3.LIZLLL(room.getOptions());
                if (strLIZLLL != null) {
                    map.put("options", strLIZLLL);
                }
                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).T8(map);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0INM c0inm = new C0INM(this, C500260Jjc.LJIILL(R.layout.gup, viewGroup, false));
        try {
            View view = c0inm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0inm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0inm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0INM.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0inm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0inm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0INM.class.getName();
        return c0inm;
    }
}
