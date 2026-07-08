package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.dataChannel.GameGuessEmoteUpdateChannel;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110390f09 {
    public static boolean LIZIZ;
    public static Resources LIZLLL;
    public static final C513300KBc LJIILIIL;
    public static final C1110380f08 LJIILJJIL;
    public static final C1110370f07 LJIILL;
    public static final C1110400f0A LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final C1110390f09 LIZ = new C1110390f09();
    public static int LIZJ = -7829368;
    public static final HashMap<EnumC1110450f0F, Drawable> LJ = new HashMap<>();
    public static final HashMap<String, EmoteModel> LJFF = new HashMap<>();
    public static final C1110440f0E LJI = new C1110440f0E();
    public static final ArrayList<C1110420f0C<String>> LJII = new ArrayList<>();
    public static final ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> LJIIIIZZ = new ArrayList<>();
    public static final ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> LJIIIZ = new ArrayList<>();
    public static final ArrayList<C1110420f0C<String>> LJIIJ = new ArrayList<>();
    public static final ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> LJIIJJI = new ArrayList<>();
    public static final ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> LJIIL = new ArrayList<>();

    static {
        C513300KBc c513300KBc = new C513300KBc();
        LJIILIIL = c513300KBc;
        C1110380f08 c1110380f08 = new C1110380f08(c513300KBc);
        LJIILJJIL = c1110380f08;
        C1110370f07 c1110370f07 = new C1110370f07(c1110380f08);
        LJIILL = c1110370f07;
        LJIILLIIL = new C1110400f0A(c1110370f07);
    }

    public static int LIZIZ(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EmoteWithIndex emoteWithIndex = (EmoteWithIndex) obj;
            HashMap<String, EmoteModel> map = LJFF;
            EmoteModel emoteModel = emoteWithIndex.emoteModel;
            String str2 = null;
            if (emoteModel != null) {
                str = emoteModel.emoteId;
            } else {
                str = null;
            }
            if (map.containsKey(str)) {
                EmoteModel emoteModel2 = emoteWithIndex.emoteModel;
                if (emoteModel2 != null) {
                    str2 = emoteModel2.emoteId;
                }
                EmoteModel emoteModel3 = map.get(str2);
                if (emoteModel3 != null && emoteModel3.emoteResource != null) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    public static void LJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            EmoteModel emoteModel = (EmoteModel) it2.next();
            LJFF.put(emoteModel.emoteId, emoteModel);
        }
        C1110400f0A c1110400f0A = LJIILLIIL;
        HashMap<String, EmoteModel> map = LJFF;
        c1110400f0A.getClass();
        for (C1110420f0C<String> c1110420f0C : LJII) {
            c1110420f0C.LIZIZ(map, new AwS261S0300000_17((C1110420f0C) c1110420f0C, (C1110420f0C<String>) c1110400f0A, (C1110400f0A) map, (HashMap<String, EmoteModel>) 23), new AwS561S0100000_17(c1110420f0C, (C1110420f0C<String>) 652));
        }
        ArrayList<C1110420f0C<String>> arrayList = LJII;
        arrayList.clear();
        ArrayList<C1110420f0C<String>> arrayList2 = LJIIJ;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        C1110370f07 c1110370f07 = LJIILL;
        HashMap<String, EmoteModel> map2 = LJFF;
        c1110370f07.getClass();
        for (C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>> c1110410f0B : LJIIIZ) {
            c1110410f0B.LIZIZ(map2, new AwS261S0300000_17((C1110410f0B) c1110410f0B, (C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>) c1110370f07, (C1110370f07) map2, (HashMap<String, EmoteModel>) 22), new AwS561S0100000_17(c1110410f0B, (C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>) 651));
        }
        ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> arrayList3 = LJIIIZ;
        arrayList3.clear();
        ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> arrayList4 = LJIIL;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        C1110380f08 c1110380f08 = LJIILJJIL;
        HashMap<String, EmoteModel> map3 = LJFF;
        c1110380f08.getClass();
        for (C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>> c1110410f0B2 : LJIIIIZZ) {
            c1110410f0B2.LIZIZ(map3, new AwS261S0300000_17((C1110410f0B) c1110410f0B2, (C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>) c1110380f08, (C1110380f08) map3, (HashMap<String, EmoteModel>) 21), new AwS561S0100000_17(c1110410f0B2, (C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>) 650));
        }
        ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> arrayList5 = LJIIIIZZ;
        arrayList5.clear();
        ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> arrayList6 = LJIIJJI;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
    }

    public static SpannableStringBuilder LIZJ(EmoteModel emoteModel, EnumC1110450f0F enumC1110450f0F, LifecycleOwner lifecycleOwner, Function1 function1) {
        return (SpannableStringBuilder) ListProtector.get(LJIILL.LIZ(Collections.singletonList(emoteModel), enumC1110450f0F, null, lifecycleOwner, new AwS596S0100000_17(function1, (Function1<? super C1270404y6, Unit>) 687), LJFF), 0);
    }

    public final void LIZLLL(Context context, LifecycleOwner lifecycleOwner, boolean z, Room room, boolean z2) {
        GameEmotesTab gameEmotesTab;
        EmoteListResult emoteListResult;
        List<EmoteModel> emoteList;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        String str;
        SubscribeInfo subscribeInfo2;
        LIZIZ = C497740JfY.LJJ();
        LIZJ = C20736316Cj.LIZIZ(R.attr.fy4, context);
        LIZLLL = context.getResources();
        LJIIZILJ = z2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        C0KBS c0kbs = C0KBS.LIZ;
        C0KBS.LJIIIIZZ.clear();
        C0KBS.LJIIZILJ = LJIIZILJ;
        if (!z) {
            if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified() && (owner2 = room.getOwner()) != null && owner2.isSubscribed()) {
                context.getResources();
                User owner3 = room.getOwner();
                if (owner3 == null || (subscribeInfo2 = owner3.getSubscribeInfo()) == null || (str = subscribeInfo2.packageId) == null) {
                    str = "";
                }
                C0KBS.LJIIIIZZ(str, false, ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId(), room.getId());
            }
            DataChannelGlobal.LLILZ.EQ2(this, lifecycleOwner, EmoteBitmapListChannel.class, AFwS254S0000000_17.get$arr$(458));
        } else {
            dataChannelGlobal.DQ2(EmoteBitmapListChannel.class, this, AFwS254S0000000_17.get$arr$(457));
        }
        if (room != null && (gameEmotesTab = room.gameEmotesTab) != null && (emoteListResult = gameEmotesTab.usableGuessingEmotes) != null && (emoteList = emoteListResult.getEmoteList()) != null) {
            LJ(emoteList);
        }
        DataChannelGlobal.LLILZ.EQ2(this, lifecycleOwner, GameGuessEmoteUpdateChannel.class, new AwS596S0100000_17(room, 688));
    }

    public static SpannableStringBuilder LIZ(List list, EnumC1110450f0F enumC1110450f0F, String str, Resources resources, Function1 function1, Function0 function0, Function1 function12, LifecycleOwner lifecycleOwner, boolean z) {
        return LJIILLIIL.LIZ(list, enumC1110450f0F, str, resources, function1, function0, function12, false, lifecycleOwner, LJFF, z);
    }
}
