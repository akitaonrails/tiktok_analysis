package X;

import Y.AComparatorS22S0000000_3;
import Y.AComparatorS50S0000000_31;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15KL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.localmusic.LocalMusicProvider$Companion$scanLocalMusicTask$1", f = "LocalMusicProvider.kt", l = {117}, m = "invokeSuspend")
public final class C15KL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC196862120m LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15KL(boolean z, Context context, int i, int i2, InterfaceC196862120m interfaceC196862120m, InterfaceC1364105Vn<? super C15KL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = interfaceC196862120m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15KL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList<MusicModel> arrayList;
        String string;
        Uri uri;
        C1C7U.LIZ("LocalMusicProvider$Companion@897a.scanLocalMusicTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList2 = new ArrayList();
            if (this.LLILLJJLI) {
                ArrayList arrayList3 = new ArrayList();
                C0VSJ c0vsj = new C0VSJ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getExtractMusicAudioDir());
                if (c0vsj.isDirectory()) {
                    File[] fileArrListFiles = c0vsj.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 1) {
                        AComparatorS22S0000000_3 aComparatorS22S0000000_3 = new AComparatorS22S0000000_3(38);
                        if (fileArrListFiles.length > 1) {
                            Arrays.sort(fileArrListFiles, aComparatorS22S0000000_3);
                        }
                    }
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            arrayList3.add(C15KM.LIZ(file));
                        }
                    }
                }
                arrayList2.addAll(arrayList3);
            }
            Context context = this.LLILLL;
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri2, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration", "date_modified"}, null, null, "title_key", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32hVlYOBJ+ZbLyKfa0gqFKUIm1uzQ4CN4YDmSkhi", null));
            if (cursorLJJJ == null) {
                arrayList = new ArrayList();
            } else {
                cursorLJJJ.move(i2);
                arrayList = new ArrayList();
                while (cursorLJJJ.moveToNext() && i3 > 0) {
                    i3--;
                    int i4 = cursorLJJJ.getInt(cursorLJJJ.getColumnIndex("is_music"));
                    long j = cursorLJJJ.getLong(cursorLJJJ.getColumnIndex("duration"));
                    if (C142I.LIZLLL() || i4 != 0) {
                        long j2 = cursorLJJJ.getLong(cursorLJJJ.getColumnIndex("_id"));
                        String string2 = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("title"));
                        Uri uriWithAppendedId = ContentUris.withAppendedId(uri2, j2);
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(uri2);
                            try {
                                sb.append('/');
                                sb.append(j2);
                                sb.append("/albumart");
                                uri = UriProtector.parse(sb.toString());
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (Drawable.createFromStream(C09NT.LJ(context.getContentResolver(), uri), null) != null) {
                            string = uri.toString();
                        } else {
                            string = null;
                        }
                        String string3 = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("artist"));
                        String string4 = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("album"));
                        String string5 = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("_display_name"));
                        long j3 = cursorLJJJ.getLong(cursorLJJJ.getColumnIndex("_size"));
                        MusicModel musicModel = new MusicModel();
                        long j4 = -C1131404bg.LIZ(j3, string5, string3, string4);
                        musicModel.setLocalMusicId(j4);
                        musicModel.setId(j4);
                        musicModel.setMusicId(String.valueOf(j4));
                        musicModel.setName(string2);
                        musicModel.setMusicStatus(1);
                        musicModel.setAlbum(string4);
                        if (TextUtils.equals("<unknown>", string3)) {
                            string3 = "unknown";
                        }
                        musicModel.setSinger(string3);
                        musicModel.setLocalPath(uriWithAppendedId.toString());
                        musicModel.setLocalThumbPath(string);
                        musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                        musicModel.setMusicType(0);
                        musicModel.setLocalMusicDuration(j);
                        musicModel.setDuration((int) j);
                        musicModel.setDataType(1);
                        musicModel.setDateLastModified(Long.valueOf(cursorLJJJ.getLong(cursorLJJJ.getColumnIndex("date_modified")) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                        arrayList.add(musicModel);
                    }
                }
                for (MusicModel musicModel2 : arrayList) {
                    C19342110ln c19342110ln = C19342110ln.LIZ;
                    long duration = musicModel2.getDuration();
                    c19342110ln.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C15IE.LIZ(c2344009Gk);
                    c2344009Gk.LIZLLL(duration, "content_duration");
                    c2344009Gk.LIZLLL(0L, "duration");
                    c2344009Gk.LJIIIIZZ("upload_method", "batch_import");
                    C20684815ws.LJIILLIIL("upload_sound_from_video", c2344009Gk.LIZ);
                }
                cursorLJJJ.close();
            }
            arrayList2.addAll(arrayList);
            if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new AComparatorS50S0000000_31(13));
            }
            C2238608ps c2238608ps = C2108208Ns.LIZ;
            C15KC c15kc = new C15KC(this.LLILLL, arrayList2, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c15kc) == objLJFF) {
                C1C7U.LIZIZ("LocalMusicProvider$Companion@897a.scanLocalMusicTask$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalMusicProvider$Companion@897a.scanLocalMusicTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
