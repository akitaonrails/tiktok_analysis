package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637830P0b extends C09AY implements Function2<VideoMusicTitleAssem, C291001Au<? extends Boolean>, Unit> {
    public C637830P0b() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            if (((Boolean) c291001Au2.LIZ).booleanValue()) {
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoMusicTitleAssem.LLLLIL;
                videoMusicTitleAssem2.Xp().xQ2();
            } else {
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = VideoMusicTitleAssem.LLLLIL;
                videoMusicTitleAssem2.Xp().yQ2();
            }
        }
        return Unit.LIZ;
    }
}
