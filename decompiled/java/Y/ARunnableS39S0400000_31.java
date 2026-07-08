package Y;

import X.C0WZX;
import X.C1131404bg;
import X.C142I;
import X.C154B;
import X.C15DF;
import X.C15DO;
import X.C15L7;
import X.C1C7U;
import X.C20359414lU;
import X.C20359714lX;
import X.C20651915rZ;
import X.C20656115sF;
import X.C2204961BRm;
import X.C2344809Gs;
import X.C500260Jjc;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C976480bWA;
import X.C978440bZK;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaAnimationTimingSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.poplayer.core.PopupTaskExecutor;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS575S0100000_31;
import v7.o;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS39S0400000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Method method = PopupTaskExecutor.LLIZLLLIL;
        Object objA0 = method != null ? C2204961BRm.a0(method, ((C20656115sF) this.l0).LLILZLL, new Object[]{this.l1}, new C0WZX("dzBzEgAjS8/YVFkiQFyUaTx+nDE3uF1zoslidQ4UDVt7WdPfIPAVKZPsJiuJ", null)) : null;
        View view = objA0 instanceof View ? (View) objA0 : null;
        if (view == null) {
            C20651915rZ.LIZ("task=" + ((C20656115sF) this.l0).LLILLJJLI + " getRootView null, dismiss to unblock queue");
            ((C20656115sF) this.l0).LLILZLL.getStateWrapper().LIZ();
            return;
        }
        if (PopupManager.LJIIIIZZ()) {
            C20651915rZ.LIZ("task=" + ((C20656115sF) this.l0).LLILLJJLI + " show failed: manager_stopped (deferred)");
            ((C20656115sF) this.l0).LLILZLL.getStateWrapper().LIZ();
            return;
        }
        PopupTaskExecutor popupTaskExecutor = (PopupTaskExecutor) this.l2;
        C20656115sF c20656115sF = (C20656115sF) this.l0;
        C688120Qyw c688120Qyw = (C688120Qyw) this.l3;
        popupTaskExecutor.getClass();
        PopupTaskExecutor.LJII(c20656115sF, view, c688120Qyw);
    }

    public final void LIZ$1() throws Throwable {
        if (((C15DO) this.l0).LIZ < 1000000) {
            C500260Jjc.LJIILIIL(((C15DF) this.l1).getTvRightMatchScoreTextFromXml());
            C15DF c15df = (C15DF) this.l1;
            long j = ((C15DO) this.l0).LIZ;
            long j2 = ((C976480bWA) this.l3).LIZIZ;
            LiveMatchEnigmaAnimationTimingSettings liveMatchEnigmaAnimationTimingSettings = LiveMatchEnigmaAnimationTimingSettings.INSTANCE;
            c15df.LJFF(false, j, j2, liveMatchEnigmaAnimationTimingSettings.getScoreAnimationDuration(liveMatchEnigmaAnimationTimingSettings.getScrollAnimationThreshold()), new AwS575S0100000_31((C15DF) this.l1, 1333));
            return;
        }
        TuxTextView tvRightMatchScoreTextFromXml = ((C15DF) this.l1).getTvRightMatchScoreTextFromXml();
        C15DF c15df2 = (C15DF) this.l1;
        tvRightMatchScoreTextFromXml.setText(C978440bZK.LIZIZ(c15df2.LLJJJJ, ((C15DO) this.l0).LIZ, ((C15DO) this.l2).LIZ, false, c15df2.LLJJIJIL));
        View view = ((C15DF) this.l1).LLJLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C15DF c15df3 = (C15DF) this.l1;
        c15df3.LLLIZZ = true;
        c15df3.LJJIJIIJIL();
    }

    public final void LIZ$2() {
        Method method = PopupTaskExecutor.LLJI;
        Object objA0 = method != null ? C2204961BRm.a0(method, ((C20656115sF) this.l0).LLILZLL, new Object[]{this.l1}, new C0WZX("dzBzEgAjS8/YVFkiQFyUaTx+nDE3uF1zoslidQ4UDVt7WdPfIPAVKZPsJiuJ", null)) : null;
        View view = objA0 instanceof View ? (View) objA0 : null;
        if (view == null) {
            C20651915rZ.LIZ("task=" + ((C20656115sF) this.l0).LLILLJJLI + " getRealShowView null, dismiss to unblock queue");
            ((C20656115sF) this.l0).LLILZLL.getStateWrapper().LIZ();
            return;
        }
        if (PopupManager.LJIIIIZZ()) {
            C20651915rZ.LIZ("task=" + ((C20656115sF) this.l0).LLILLJJLI + " show failed: manager_stopped (deferred)");
            ((C20656115sF) this.l0).LLILZLL.getStateWrapper().LIZ();
            return;
        }
        PopupTaskExecutor popupTaskExecutor = (PopupTaskExecutor) this.l2;
        C20656115sF c20656115sF = (C20656115sF) this.l0;
        C688120Qyw c688120Qyw = (C688120Qyw) this.l3;
        popupTaskExecutor.getClass();
        PopupTaskExecutor.LJII(c20656115sF, view, c688120Qyw);
    }

    public static final void run$0(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PopupTaskExecutor@ad7d.showPopLayerInner$1");
        try {
            aRunnableS39S0400000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PopupTaskExecutor@ad7d.showPopLayerInner$1");
    }

    public static final void run$1(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MusicRecordService@49d8.triggerShowDialog$1");
        try {
            MusicRecordService musicRecordService = (MusicRecordService) aRunnableS39S0400000_31.l3;
            if (musicRecordService.LJI) {
                musicRecordService.LIZLLL((Activity) aRunnableS39S0400000_31.l0, (MusicModel) aRunnableS39S0400000_31.l1, (C15L7) aRunnableS39S0400000_31.l2, Boolean.FALSE);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicRecordService@49d8.triggerShowDialog$1");
    }

    public static final void run$2(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.playRollingAnimationForTeamMatchIfNeeded$4");
        try {
            aRunnableS39S0400000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.playRollingAnimationForTeamMatchIfNeeded$4");
    }

    public static final void run$3(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PopupTaskExecutor@ad7d.executeStandardRealShow$1");
        try {
            aRunnableS39S0400000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PopupTaskExecutor@ad7d.executeStandardRealShow$1");
    }

    public static final void run$4(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PlaybookDirector@b1f8.unDoDecorationPlaybook$forceUndoLayoutRunnable$1");
        try {
            if (((AtomicBoolean) aRunnableS39S0400000_31.l0).compareAndSet(false, true)) {
                ((C20359714lX) aRunnableS39S0400000_31.l1).LJIILLIIL((C20359414lU) aRunnableS39S0400000_31.l3, (List) aRunnableS39S0400000_31.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaybookDirector@b1f8.unDoDecorationPlaybook$forceUndoLayoutRunnable$1");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15KN] */
    public static final void run$5(ARunnableS39S0400000_31 aRunnableS39S0400000_31) {
        C154B c154b = (C154B) aRunnableS39S0400000_31.l0;
        WeakReference weakReference = (WeakReference) aRunnableS39S0400000_31.l1;
        final List<? extends MusicModel> list = (List) aRunnableS39S0400000_31.l2;
        final o oVar = (o) aRunnableS39S0400000_31.l3;
        c154b.getClass();
        C1C7U.LIZ("LocalMusicModel@3dc1.scanPageMusicListTask$1L");
        Context context = (Context) weakReference.get();
        Objects.requireNonNull(oVar);
        final ?? r0 = new IAVInfoService.IGetInfoCallback() { // from class: X.15KN
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(Object obj) {
                oVar.LJ(obj);
            }
        };
        if (context == null) {
            C2344809Gs.LIZLLL(3, "Local Sound ", "context is null");
            r0.finish(new ArrayList());
        } else {
            list.clear();
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            final ArrayList arrayList = new ArrayList();
            if (c154b.LJ == null) {
                c154b.LJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration"}, null, null, "title_key", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32lVkoeBZN9HJSDdRAuD+hauOa2M3Q==", null));
            }
            Cursor cursor = c154b.LJ;
            if (cursor == null) {
                C2344809Gs.LIZLLL(3, "Local Sound ", "cursor is null");
                r0.finish(list);
            } else {
                int i = c154b.LIZLLL;
                int i2 = i * 20;
                int count = ((i + 1) * 20) - 1;
                if (count > cursor.getCount() - 1) {
                    count = c154b.LJ.getCount() - 1;
                    c154b.LIZIZ = true;
                }
                if (i2 <= c154b.LJ.getCount() - 1) {
                    c154b.LJ.moveToPosition(i2 - 1);
                    while (c154b.LJ.moveToNext()) {
                        Cursor cursor2 = c154b.LJ;
                        int i3 = cursor2.getInt(cursor2.getColumnIndex("is_music"));
                        if (C142I.LIZLLL() || i3 != 0) {
                            Cursor cursor3 = c154b.LJ;
                            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, cursor3.getLong(cursor3.getColumnIndex("_id")));
                            Cursor cursor4 = c154b.LJ;
                            String string = cursor4.getString(cursor4.getColumnIndex("title"));
                            Cursor cursor5 = c154b.LJ;
                            String string2 = cursor5.getString(cursor5.getColumnIndex("artist"));
                            Cursor cursor6 = c154b.LJ;
                            String string3 = cursor6.getString(cursor6.getColumnIndex("album"));
                            Cursor cursor7 = c154b.LJ;
                            cursor7.getLong(cursor7.getColumnIndex("album_id"));
                            Cursor cursor8 = c154b.LJ;
                            long j = cursor8.getLong(cursor8.getColumnIndex("duration"));
                            Cursor cursor9 = c154b.LJ;
                            String string4 = cursor9.getString(cursor9.getColumnIndex("_display_name"));
                            Cursor cursor10 = c154b.LJ;
                            long j2 = cursor10.getLong(cursor10.getColumnIndex("_size"));
                            MusicModel musicModel = new MusicModel();
                            musicModel.setLocalMusicId(C1131404bg.LIZ(j2, string4, string2, string3));
                            musicModel.setName(string);
                            musicModel.setMusicStatus(1);
                            musicModel.setAlbum(string3);
                            if (TextUtils.equals("<unknown>", string2)) {
                                string2 = "unknown";
                            }
                            musicModel.setSinger(string2);
                            musicModel.setLocalPath(uriWithAppendedId.toString());
                            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                            musicModel.setMusicType(0);
                            musicModel.setLocalMusicDuration(j);
                            musicModel.setDataType(1);
                            list.add(musicModel);
                            arrayList.add(Long.valueOf(j));
                            if (c154b.LJ.getPosition() == count) {
                                break;
                            }
                        }
                    }
                    c154b.LIZLLL++;
                    if (c154b.LIZIZ) {
                        c154b.LJ.close();
                        c154b.LJ = null;
                    }
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().audioLegal(context, list, new IAVInfoService.IFilterMedia() { // from class: X.0hbA
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
                        public final boolean filter(Object obj) {
                            ArrayList arrayList2 = arrayList;
                            Integer num = (Integer) obj;
                            if (((Long) ListProtector.get(arrayList2, num.intValue())).longValue() > 10000 && ((Long) ListProtector.get(arrayList2, num.intValue())).longValue() < 600000) {
                                return true;
                            }
                            return false;
                        }
                    }, new IAVInfoService.IGetInfoCallback() { // from class: X.15KB
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                        public final void finish(Object obj) {
                            List list2 = (List) obj;
                            r0.finish(list2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("cnt:");
                            sbLIZ.append(list2.size());
                            C2344809Gs.LIZLLL(3, "Local Sound filter result", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    });
                } else {
                    c154b.LJ.close();
                    C2344809Gs.LIZLLL(3, "Local Sound ", "cursor has reached end");
                    r0.finish(list);
                }
            }
        }
        C1C7U.LIZIZ("LocalMusicModel@3dc1.scanPageMusicListTask$1L");
    }

    public ARunnableS39S0400000_31(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public ARunnableS39S0400000_31(MusicRecordService musicRecordService, Activity activity, MusicModel musicModel, C15L7 c15l7, String str, int i) {
        this.$t = i;
        this.l3 = musicRecordService;
        this.l0 = activity;
        this.l1 = musicModel;
        this.l2 = c15l7;
    }
}
