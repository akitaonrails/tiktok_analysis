package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226251CBj extends Message<C2226251CBj, C2226261CBk> {
    public static final ProtoAdapter<C2226251CBj> ADAPTER = new ProtoAdapter<C2226251CBj>() { // from class: X.1CBi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226251CBj decode(ProtoReader protoReader) {
            C2226251CBj c2226251CBj = new C2226251CBj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c2226251CBj.show_sticker_time = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c2226251CBj.sticker_title = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2226251CBj.sticker_info_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2226251CBj.button_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2226251CBj.button_color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226251CBj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226251CBj c2226251CBj) {
            C2226251CBj c2226251CBj2 = c2226251CBj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2226251CBj2.button_color) + protoAdapter.encodedSizeWithTag(2, c2226251CBj2.button_title) + protoAdapter.encodedSizeWithTag(3, c2226251CBj2.sticker_info_url) + protoAdapter.encodedSizeWithTag(4, c2226251CBj2.sticker_title) + ProtoAdapter.INT32.encodedSizeWithTag(5, c2226251CBj2.show_sticker_time) + c2226251CBj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226251CBj c2226251CBj) {
            C2226251CBj c2226251CBj2 = c2226251CBj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2226251CBj2.button_color);
            protoAdapter.encodeWithTag(protoWriter, 2, c2226251CBj2.button_title);
            protoAdapter.encodeWithTag(protoWriter, 3, c2226251CBj2.sticker_info_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c2226251CBj2.sticker_title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c2226251CBj2.show_sticker_time);
            protoWriter.writeBytes(c2226251CBj2.unknownFields());
        }
    };
    public String button_color;
    public String button_title;
    public Integer show_sticker_time;
    public String sticker_info_url;
    public String sticker_title;

    public C2226251CBj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226261CBk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
