package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.LiveCommentPanelCustomSysEmojiSetting;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.comment.emoji.LiveCommentEmojiSwitchSettingSetting;
import com.bytedance.android.livesdk.comment.emoji.LiveCommentPanelEmojiListSetting;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentDrawableEmojiSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0f88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115340f88 extends ConstraintLayout implements InterfaceC1115480f8M {
    public final EnumC584890Mwp LL;
    public final LifecycleOwner LLILLJJLI;
    public C1115400f8E LLILLL;
    public InterfaceC1114330f6V LLILZ;
    public int LLILZIL;
    public DataChannel LLILZLL;
    public List<String> LLIZ;
    public List<String> LLIZLLLIL;

    private int getLayoutResource() {
        return R.layout.hrf;
    }

    private List<C1115500f8O> getCustomSysEmojiList() {
        String[] value = LiveCommentPanelCustomSysEmojiSetting.INSTANCE.getValue();
        C1115360f8A c1115360f8ALIZJ = C1115360f8A.LIZJ();
        List listAsList = Arrays.asList(value);
        c1115360f8ALIZJ.getClass();
        return C1115360f8A.LJ(listAsList, false);
    }

    @Override // X.InterfaceC1115480f8M
    public final void LLLLJI(C1115500f8O c1115500f8O) {
        InterfaceC1114330f6V interfaceC1114330f6V;
        String str;
        if (c1115500f8O != null && (interfaceC1114330f6V = this.LLILZ) != null) {
            interfaceC1114330f6V.LIZLLL(c1115500f8O);
            DataChannel dataChannel = this.LLILZLL;
            if (c1115500f8O.recentlyUsed) {
                str = "under_operation_button";
            } else {
                str = "emoji_panel";
            }
            String str2 = c1115500f8O.previewEmoji;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emoji_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(str, "position");
            c474500IjALIZ.LJJII(str2, "emoji");
            c474500IjALIZ.LJJII(Integer.valueOf(c1115500f8O instanceof C1115490f8N ? 1 : 0), "with_beans_emoji");
            c474500IjALIZ.LIZ();
        }
    }

    public final void h0(boolean z) {
        int i;
        ArrayList arrayList;
        if (z) {
            i = 7;
        } else {
            i = 12;
        }
        this.LLILZIL = i;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ms4);
        C1115400f8E c1115400f8E = new C1115400f8E(getContext(), this.LLILLJJLI);
        this.LLILLL = c1115400f8E;
        c1115400f8E.LLILZ = this;
        recyclerView.setAdapter(c1115400f8E);
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(this.LLILZIL, 1, getContext());
        sSGridLayoutManager.LLIZ = new C1151490g4R(this, 1);
        recyclerView.setLayoutManager(sSGridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(36);
        C1115360f8A.LIZJ().LIZ.getClass();
        final List<C1115500f8O> listCq1 = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).cq1();
        if (this.LL == EnumC584890Mwp.COMMENT) {
            final List<C1115500f8O> customSysEmojiList = getCustomSysEmojiList();
            C1115360f8A c1115360f8ALIZJ = C1115360f8A.LIZJ();
            List<String> list = this.LLIZLLLIL;
            c1115360f8ALIZJ.getClass();
            final ArrayList arrayList2 = new ArrayList(C1115360f8A.LJ(list, true));
            if (LiveCommentEmojiSwitchSettingSetting.INSTANCE.getValue()) {
                C1115360f8A c1115360f8ALIZJ2 = C1115360f8A.LIZJ();
                List<String> listAsList = this.LLIZ;
                c1115360f8ALIZJ2.getClass();
                if (C0IKQ.LIZ(listAsList)) {
                    listAsList = Arrays.asList(LiveCommentPanelEmojiListSetting.INSTANCE.getValue());
                }
                int i2 = 0;
                List<C1115500f8O> listLJ = C1115360f8A.LJ(listAsList, false);
                if (!customSysEmojiList.isEmpty()) {
                    int i3 = 0;
                    while (true) {
                        arrayList = (ArrayList) listLJ;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        if (ListProtector.get(listLJ, i2) instanceof C1115490f8N) {
                            i3 = i2;
                        }
                        i2++;
                    }
                    if (i3 > 0) {
                        i3++;
                    }
                    arrayList.addAll(i3, customSysEmojiList);
                }
                e0(listLJ, arrayList2);
                return;
            }
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            getResources();
            InterfaceC314810CVr interfaceC314810CVr = new InterfaceC314810CVr() { // from class: X.0f8K
                @Override // X.InterfaceC314810CVr
                public final Object apply(Object obj) {
                    C1115340f88 c1115340f88 = this.LIZ;
                    List list2 = customSysEmojiList;
                    List list3 = listCq1;
                    List<C1115500f8O> list4 = arrayList2;
                    c1115340f88.getClass();
                    ArrayList arrayList3 = new ArrayList((Collection) obj);
                    if (!C0IKQ.LIZ(list2)) {
                        arrayList3.addAll(list2);
                    }
                    arrayList3.addAll(list3);
                    c1115340f88.e0(arrayList3, list4);
                    return Unit.LIZ;
                }
            };
            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
            if (!LiveCommentDrawableEmojiSetting.INSTANCE.getValue()) {
                interfaceC314810CVr.apply(C13BV.INSTANCE);
                return;
            }
            OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = C1115380f8C.LIZ.LIZ.LIZ;
            onlineDrawableEmojiResourceManager.getClass();
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C314800CVq(interfaceC314810CVr, onlineDrawableEmojiResourceManager, null), 3);
            return;
        }
        e0(listCq1, new ArrayList());
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.LLILZLL = dataChannel;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            this.LLIZ = room.allEmojiList;
            this.LLIZLLLIL = room.emojiList;
        }
    }

    public void setOnEmojiSelectListener(InterfaceC1114330f6V interfaceC1114330f6V) {
        this.LLILZ = interfaceC1114330f6V;
    }

    public final void e0(List<C1115500f8O> list, List<C1115500f8O> list2) {
        ArrayList arrayList = new ArrayList();
        if (C0IKQ.LIZ(list)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<C1115500f8O> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().previewEmoji);
        }
        if (!C0IKQ.LIZ(list2)) {
            for (C1115500f8O c1115500f8O : list2) {
                if (hashSet.contains(c1115500f8O.previewEmoji)) {
                    arrayList2.add(c1115500f8O);
                }
            }
        }
        if (!C0IKQ.LIZ(arrayList2)) {
            arrayList.add(new C1115520f8Q(C497740JfY.LJIJI(2131852058)));
            int size = arrayList2.size();
            int i = this.LLILZIL;
            if (size > i) {
                arrayList.addAll(arrayList2.subList(0, i));
            } else {
                arrayList.addAll(arrayList2);
            }
            arrayList.add(new C1115520f8Q(C497740JfY.LJIJI(2131852057)));
        }
        arrayList.addAll(list);
        C1115400f8E c1115400f8E = this.LLILLL;
        ((ArrayList) c1115400f8E.LLILLL).clear();
        if (!arrayList.isEmpty()) {
            ((ArrayList) c1115400f8E.LLILLL).addAll(arrayList);
        }
        this.LLILLL.notifyDataSetChanged();
    }

    public C1115340f88(Context context, LifecycleOwner lifecycleOwner, EnumC584890Mwp enumC584890Mwp) {
        super(context);
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
        this.LL = enumC584890Mwp;
        this.LLILLJJLI = lifecycleOwner;
        C786410Ut5.Sd(getLayoutResource(), C786410Ut5.ne(context), this);
    }
}
