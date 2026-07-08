package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BA extends Message<C02BA, C02JQ> {
    public static final ProtoAdapter<C02BA> ADAPTER = new ProtoAdapter<C02BA>() { // from class: X.02B9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BA decode(ProtoReader protoReader) {
            C02BA c02ba = new C02BA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02ba.used_full_song = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02ba.original_sound_infos.add(C599402Vk.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02ba.TtsInfos.add(C02B8.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02ba.CdnUrlExpired = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ba;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BA c02ba) {
            C02BA c02ba2 = c02ba;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02ba2.CdnUrlExpired) + C02B8.ADAPTER.asRepeated().encodedSizeWithTag(2, c02ba2.TtsInfos) + C599402Vk.ADAPTER.asRepeated().encodedSizeWithTag(3, c02ba2.original_sound_infos) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c02ba2.used_full_song) + c02ba2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BA c02ba) {
            C02BA c02ba2 = c02ba;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02ba2.CdnUrlExpired);
            C02B8.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02ba2.TtsInfos);
            C599402Vk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c02ba2.original_sound_infos);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c02ba2.used_full_song);
            protoWriter.writeBytes(c02ba2.unknownFields());
        }
    };
    public Long CdnUrlExpired;
    public List<C02B8> TtsInfos;
    public List<C599402Vk> original_sound_infos;
    public Boolean used_full_song;

    public C02BA() {
        super(ADAPTER, ByteString.EMPTY);
        this.TtsInfos = C1516540pZE.LJIIIIZZ();
        this.original_sound_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
